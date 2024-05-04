package com.hvdbs.leetcode.statsgenerator;

import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;
import lombok.Builder;
import lombok.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.hvdbs.leetcode.statsgenerator.StatisticsConstants.GITHUB_REPOSITORY_BASE_URL;

public class JavaStatisticsGenerateStrategy implements GenerateStrategy {
    private static final String PACKAGE_NAME = "com.hvdbs.leetcode.solution.java";
    private static final String LANGUAGE = "Java";

    @Override
    public void generate() {
        try (InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(PACKAGE_NAME.replace('.', '/'))) {
            if (inputStream == null) {
                return;
            }

            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.APPEND);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                bufferedWriter.newLine();
                bufferedWriter.append("## " + LANGUAGE);

                Map<Difficulty, List<OutputLeetCodeFormat>> difficultyListMap = bufferedReader.lines()
                        .map(solution -> {
                            String className = PACKAGE_NAME + "." + solution.substring(0, solution.lastIndexOf('.'));

                            try {
                                LeetCodeInfo leetCodeInfo = Class.forName(className).getAnnotation(LeetCodeInfo.class);

                                if (leetCodeInfo != null) {
                                    return OutputLeetCodeFormat.builder()
                                            .difficulty(leetCodeInfo.difficulty())
                                            .name(leetCodeInfo.name())
                                            .problemUrl(leetCodeInfo.url())
                                            .solutionUrl(GITHUB_REPOSITORY_BASE_URL + "/java/" + solution.replace("class", "java"))
                                            .build();
                                }

                                return null;
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                        })
                        .filter(Objects::nonNull)
                        .collect(Collectors.groupingBy(OutputLeetCodeFormat::getDifficulty));

                StatisticsGenerator.fillStatisticsTable(bufferedWriter, difficultyListMap);
            }

        } catch (IOException ignored) {
        }
    }
}