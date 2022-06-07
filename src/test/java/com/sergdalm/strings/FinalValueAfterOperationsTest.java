package com.sergdalm.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalValueAfterOperationsTest {
    FinalValueAfterOperations finalValueAfterOperations = new FinalValueAfterOperations();

    @Test
    public void checkValueAfterOperations1() {
        String[] operations = {"X--", "X++", "X--", "X--", "X++"};
        String[] operations2 = {"--X","X++","X++"};
        String[] operations3 = {"++X","++X","X++"};
        String[] operations4 = {"X++","++X","--X","X--"};

        Assertions.assertEquals(
                finalValueAfterOperations.finalValueAfterOperations(operations),
                -1
        );
        Assertions.assertEquals(
                finalValueAfterOperations.finalValueAfterOperations(operations2),
                1
        );
        Assertions.assertEquals(
                finalValueAfterOperations.finalValueAfterOperations(operations3),
                3
        );
        Assertions.assertEquals(
                finalValueAfterOperations.finalValueAfterOperations(operations4),
                0
        );
    }
}
