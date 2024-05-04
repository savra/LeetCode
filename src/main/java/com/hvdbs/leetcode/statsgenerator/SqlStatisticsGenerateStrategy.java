package com.hvdbs.leetcode.statsgenerator;

import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hvdbs.leetcode.statsgenerator.StatisticsConstants.GITHUB_REPOSITORY_BASE_URL;

public class SqlStatisticsGenerateStrategy implements GenerateStrategy {
    private static final Path oraclePackagePath = Path.of(String.join(FileSystems.getDefault().getSeparator(),
            "src", "main", "java", "com", "hvdbs", "leetcode", "solution", "oracle"));
    private static final String LANGUAGE = "Oracle";

    @Override
    public void generate() {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.APPEND)) {
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.append("## " + LANGUAGE);

            try (Stream<Path> files = Files.list(oraclePackagePath)) {
                Set<String> fileNames = files.filter(file -> !Files.isDirectory(file))
                        .map(Path::getFileName)
                        .map(Path::toString)
                        .collect(Collectors.toSet());

                Map<Difficulty, List<OutputLeetCodeFormat>> difficultyListMap = new HashMap<>();

                for (String fileName : fileNames) {
                    try (Stream<String> content = Files.lines(oraclePackagePath.resolve(fileName))) {
                        content.findFirst()
                                .filter(header -> header.startsWith("--"))
                                .ifPresent(header -> {
                                    String[] parts = header.split(";");
                                    Difficulty difficulty = Difficulty.valueOf(getValueFromHeader(parts[0]));
                                    String name = getValueFromHeader(parts[1]);
                                    String problemUrl = getValueFromHeader(parts[2]);

                                    OutputLeetCodeFormat leetCodeFormat = OutputLeetCodeFormat.builder()
                                            .difficulty(difficulty)
                                            .name(name)
                                            .problemUrl(problemUrl)
                                            .solutionUrl(GITHUB_REPOSITORY_BASE_URL + "/oracle/" + fileName)
                                            .build();

                                    difficultyListMap.computeIfAbsent(difficulty, difficultyList -> new ArrayList<>()).add(leetCodeFormat);
                                });

                    } catch (IOException ignored) {
                    }
                }

                StatisticsGenerator.fillStatisticsTable(bufferedWriter, difficultyListMap);
            }
        } catch (IOException ignored) {
        }
    }

    private String getValueFromHeader(String headerPart) {
        return headerPart.substring(headerPart.indexOf("=") + 1);
    }
}
