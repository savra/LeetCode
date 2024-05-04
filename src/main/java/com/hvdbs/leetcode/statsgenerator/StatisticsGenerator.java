package com.hvdbs.leetcode.statsgenerator;

import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;
import lombok.RequiredArgsConstructor;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class StatisticsGenerator {
    private final List<GenerateStrategy> generateStrategies = List.of(
            new JavaStatisticsGenerateStrategy(),
            new SqlStatisticsGenerateStrategy()
    );

    public void generate() {
        try {
            Path pathToReadme = Paths.get("README.md");
            FileChannel.open(pathToReadme, StandardOpenOption.WRITE).truncate(0);

            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathToReadme, StandardOpenOption.APPEND)) {
                bufferedWriter.append("# LeetCode");
                bufferedWriter.newLine();
                bufferedWriter.append("Solving problems on LeetCode");
            }

            generateStrategies.forEach(GenerateStrategy::generate);

        } catch (IOException ignored) {
        }
    }

    static void fillStatisticsTable(BufferedWriter bufferedWriter, Map<Difficulty, List<OutputLeetCodeFormat>> difficultyListMap) throws IOException {
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
