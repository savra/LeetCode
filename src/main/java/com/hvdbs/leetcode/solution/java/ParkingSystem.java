package com.hvdbs.leetcode.solution.java;

import com.hvdbs.leetcode.statsgenerator.LeetCodeInfo;
import com.hvdbs.leetcode.statsgenerator.enums.Difficulty;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

@LeetCodeInfo(difficulty = Difficulty.EASY,
        name = "Design Parking System",
        url = "https://leetcode.com/problems/design-parking-system/")
public class ParkingSystem {
    private final Map<CarType, AbstractMap.SimpleEntry<Integer, Integer>> parking = new HashMap<>();

    private enum CarType {
        BIG,
        MEDIUM,
        SMALL;

        static CarType of(int carType) {
            return switch (carType) {
                case 1 -> BIG;
                case 2 -> MEDIUM;
                case 3 -> SMALL;
                default -> throw new IllegalArgumentException("Car type not found");
            };
        }
    }

    public ParkingSystem(int big, int medium, int small) {
        parking.put(CarType.BIG, new AbstractMap.SimpleEntry<>(big, 0));
        parking.put(CarType.MEDIUM, new AbstractMap.SimpleEntry<>(medium, 0));
        parking.put(CarType.SMALL, new AbstractMap.SimpleEntry<>(small, 0));
    }

    public boolean addCar(int carType) {
        CarType c = CarType.of(carType);
        AbstractMap.SimpleEntry<Integer, Integer> lot = parking.get(c);

        if (lot.getKey() > lot.getValue()) {
            lot.setValue(lot.getValue() + 1);

            return true;
        }

        return false;
    }
}
