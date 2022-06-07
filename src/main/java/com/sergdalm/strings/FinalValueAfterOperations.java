package com.sergdalm.strings;

import java.util.Random;

/**
 * No: 2011
 * Title: Final Value of Variable After Performing Operations
 * Difficulty: Easy
 * <p>
 * There is a programming language with only four operations and one variable X:
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * <p>
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 */
public class FinalValueAfterOperations {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}
