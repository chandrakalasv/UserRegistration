package com.bridgelab.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean givenFirstName_WhenValid_ShouldReturnTrue(String validFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstName);
    }
    public static boolean givenLastName_WhenValid_ShouldReturnTrue(String validLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validLastName);
    }

    public static void main(String[] args) {
        boolean firstName = givenFirstName_WhenValid_ShouldReturnTrue("Ashaa");
        System.out.println("first name is valid");
        boolean lastName = givenFirstName_WhenValid_ShouldReturnTrue("Ushhaa");
        System.out.println("lastName is valid");
    }

}
