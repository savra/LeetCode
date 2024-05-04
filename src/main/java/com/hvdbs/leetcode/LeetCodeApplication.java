package com.hvdbs.leetcode;

import com.hvdbs.leetcode.statsgenerator.StatisticsGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeetCodeApplication.class, args);

        StatisticsGenerator statisticsGenerator = new StatisticsGenerator();
        statisticsGenerator.generate();
    }
}