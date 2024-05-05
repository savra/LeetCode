package com.hvdbs.leetcode.statsgenerator;

import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hvdbs.leetcode.statsgenerator.StatisticsConstants.GITHUB_REPOSITORY_BASE_URL;

@Slf4j
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
                        log.warn("Error opening a file with name {}", fileName);
                    }
                }

                fillStatisticsTable(bufferedWriter, difficultyListMap);
            }
        } catch (NotDirectoryException e) {
            log.error("{} is not a directory!", oraclePackagePath);
        } catch (IOException ignored) {
            log.error("Error opening a directory with the name {}", oraclePackagePath);
        }
    }

    private String getValueFromHeader(String headerPart) {
        return headerPart.substring(headerPart.indexOf("=") + 1);
    }

    private void fillStatisticsTable(BufferedWriter bufferedWriter, Map<Difficulty, List<OutputLeetCodeFormat>> difficultyListMap) throws IOException {
        for (Difficulty difficulty : difficultyListMap.keySet()) {
            bufferedWriter.newLine();
            bufferedWriter.append("<details>");
            bufferedWriter.newLine();
            bufferedWriter.append("<summary>").append(String.valueOf(difficulty)).append("</summary>");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.append("|Name|Problem|Solution|");
            bufferedWriter.newLine();
            bufferedWriter.append("|---|---|---|");
            bufferedWriter.newLine();

            for (OutputLeetCodeFormat outputLeetCodeFormat : difficultyListMap.get(difficulty)) {
                bufferedWriter.append("|")
                        .append(outputLeetCodeFormat.getName())
                        .append("|")
                        .append(outputLeetCodeFormat.getProblemUrl())
                        .append("|")
                        .append("<a href='").append(outputLeetCodeFormat.getSolutionUrl()).append("'>").append(outputLeetCodeFormat.getName()).append("</a>")
                        .append("|");
                bufferedWriter.newLine();
            }
            bufferedWriter.append("</details>");
        }
    }
}
