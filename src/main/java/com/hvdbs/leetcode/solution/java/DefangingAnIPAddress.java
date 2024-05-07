package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.CodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Defanging an IP Address",
        url = "https://leetcode.com/problems/defanging-an-ip-address/")
public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
