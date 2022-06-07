package com.sergdalm.strings;

/**
 * No: 1108
 * Title: Defanging an IP Address
 * Difficulty: Easy
 * <p>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]"
 */
public class DefangIPaddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
