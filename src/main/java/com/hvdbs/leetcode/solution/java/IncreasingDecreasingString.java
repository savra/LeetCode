package com.hvdbs.leetcode.solution.java;

import java.util.Arrays;

public class IncreasingDecreasingString {
    public static String sortString(String s) {
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);

        int i = 1;
        int k = 1;

        while(i < chars.length) {
            if (chars[i] > sb.charAt(sb.length() - 1)) {
                sb.append(chars[i]);
                k++;
            }

            i++;
        }

        sb.append(chars[chars.length - 1]);

        i = chars.length - 2;

        while(i > 1) {
            if (chars[i] < sb.charAt(sb.length() - 1)) {
                sb.append(chars[i]);
            }

            i--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String aaaabbbbcccc = sortString("aaaabbbbcccc");
    }
}
