package com.sergdalm.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DefangIPaddressTest {
    DefangIPaddress defangIPaddress = new DefangIPaddress();
    @Test
    public void checkOutput() {
        assertEquals(defangIPaddress.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
        assertEquals(defangIPaddress.defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
    }
}
