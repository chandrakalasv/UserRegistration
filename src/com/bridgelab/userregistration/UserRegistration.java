package com.bridgelab.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean givenFirstName_WhenValid_ShouldReturnTrue(String validFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstName);
    }

    public static void main(String[] args) {
        boolean result = givenFirstName_WhenValid_ShouldReturnTrue("Ashaa");
        System.out.println(result);
    }

}
