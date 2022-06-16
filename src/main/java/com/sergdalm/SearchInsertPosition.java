package com.sergdalm;

/**
 * No: 35
 * Title: Search Insert Position
 * Difficulty: Easy
 * <p>
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 1));
    }

    public static int searchInsert(int[] nums, int target) {
        return searchInsertRecursion(nums, 0, nums.length, target);
    }

    private static int searchInsertRecursion(int[] nums, int start, int end, int target) {
        if (end - start == 1) {
            if (nums[start] == target)
                return start;
            else if (nums[start] > target)
                return start == 0 ? 0 : start - 1;
            else
                return start + 1;
        }

        int middleIndex = (start + end) / 2;
        if (target == nums[middleIndex])
            return middleIndex;
        else if (target >= nums[middleIndex])
            return searchInsertRecursion(nums, middleIndex, end, target);
        else
            return searchInsertRecursion(nums, start, middleIndex, target);
    }
}
