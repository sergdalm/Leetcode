package com.sergdalm.strings;

/**
 * No: 14
 * Title: Longest Common Prefix
 * Difficulty: Easy
 * <p>
 * Write a function to find the longest common
 * prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String commonPrefix = longestCommonPrefix(new String[]{
                "flower", "flow", "flight"
        });
        System.out.println(commonPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0] == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        char currentChar;
        String firstString = strs[0];
        for (int i = 0; i < firstString.length(); i++) {
            currentChar = firstString.charAt(i);
            for (String str : strs) {
                if (str == null ||
                        str.length() - 1 < i ||
                        currentChar != str.charAt(i)) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(currentChar);
        }

        return stringBuilder.toString();
    }
}
