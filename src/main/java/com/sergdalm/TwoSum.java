package com.sergdalm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * No: 1
 * Title: Two Sum
 * Difficulty: Easy
 * <p>
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Optional<Integer> maybeNumber = numbers.keySet().stream()
                    .filter(n -> numbers.get(n) + num == target)
                    .findFirst();
            if (maybeNumber.isPresent()) {
                result[0] = maybeNumber.get();
                result[1] = i;
                break;
            }
            numbers.put(i, nums[i]);
        }
        return result;
    }
}