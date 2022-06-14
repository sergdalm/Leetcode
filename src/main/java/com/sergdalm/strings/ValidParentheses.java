package com.sergdalm.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * No: 20
 * Title: Valid Parentheses
 * Difficulty: Easy
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "([)]"
 * Output: false
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(([{}]))"));
    }

    public static boolean isValid(String s) {
        List<BracketType> brackets = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            switch (currentChar) {
                case '[' -> brackets.add(BracketType.SQUARE_BRACKETS);
                case ']' -> {
                    if (brackets.size() == 0 ||
                            brackets.remove(brackets.size() - 1) != BracketType.SQUARE_BRACKETS) {
                        return false;
                    }
                }
                case '{' -> brackets.add(BracketType.CURLY_BRACES);
                case '}' -> {
                    if (brackets.size() == 0 ||
                            brackets.remove(brackets.size() - 1) != BracketType.CURLY_BRACES) {
                        return false;
                    }
                }
                case '(' -> brackets.add(BracketType.PARENTHESES);
                case ')' -> {
                    if (brackets.size() == 0 ||
                            brackets.remove(brackets.size() - 1) != BracketType.PARENTHESES) {
                        return false;
                    }
                }
            }
        }
        return brackets.size() == 0;
    }

    enum BracketType {
        SQUARE_BRACKETS,
        CURLY_BRACES,
        PARENTHESES
    }
}
