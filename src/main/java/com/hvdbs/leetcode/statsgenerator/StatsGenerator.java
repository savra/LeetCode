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
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatsGenerator {
    private static final String packageName = "com.hvdbs.leetcode.solution.java";
    private static final String solutionBaseUrl = "https://github.com/savra/LeetCode/blob/master/src/main/java/com/hvdbs/leetcode/solution/java/";

    public static void generate() {
        try (InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replace('.', '/'))) {
            if (inputStream == null) {
                return;
            }

            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("README.md"), StandardOpenOption.TRUNCATE_EXISTING);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

                bufferedWriter.append("# LeetCode");
                bufferedWriter.newLine();
                bufferedWriter.append("Solving problems on LeetCode");
                bufferedWriter.newLine();
                bufferedWriter.append("<details>");
                bufferedWriter.newLine();

                Map<Difficulty, List<OutputLeetCodeFormat>> difficultyListMap = bufferedReader.lines()
                        .map(solution -> {
                            String className = packageName + "." + solution.substring(0, solution.lastIndexOf('.'));

                            try {
                                LeetCodeInfo leetCodeInfo = Class.forName(className).getAnnotation(LeetCodeInfo.class);

                                if (leetCodeInfo != null) {
                                    return OutputLeetCodeFormat.builder()
                                            .difficulty(leetCodeInfo.difficulty())
                                            .name(leetCodeInfo.name())
                                            .problemUrl(leetCodeInfo.url())
                                            .solutionUrl(solutionBaseUrl + solution.replace("class", "java"))
                                            .build();
                                }

                                return null;
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                        })
                        .filter(Predicate.not(Objects::isNull))
                        .collect(Collectors.groupingBy(OutputLeetCodeFormat::getDifficulty));

                for (Difficulty difficulty : difficultyListMap.keySet()) {
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
                                .append(outputLeetCodeFormat.getSolutionUrl())
                                .append("|");
                        bufferedWriter.newLine();
                    }
                }

                bufferedWriter.append("</details>");
            }

        } catch (IOException e) {

        }
    }

    @Builder
    @Data
    private static final class OutputLeetCodeFormat {
        private String name;
        private String problemUrl;
        private String solutionUrl;
        private Difficulty difficulty;
    }
}
