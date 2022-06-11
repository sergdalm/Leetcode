package com.sergdalm;

/**
 * No: 9
 * Title: Palindrome Number
 * Difficulty: Easy
 * <p>
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 * <p>
 * Constraints: -2^31 <= x <= 2^31 - 1
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100001));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        double number = x;
        int length = (int) (Math.log10(number) + 1);
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) number % 10);
            number /= 10;
        }

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            if (numbers[i] != numbers[j]) {
                return false;
            }
        }
        return true;
    }
}
