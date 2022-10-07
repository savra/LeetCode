package com.hvdbs.leetcode.statsgenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface LeetCodeInfo {
    Difficulty difficulty();

    String name();

    String url();
}
