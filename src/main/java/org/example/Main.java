package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean checkForPalindrome(String input) {
        if(input == null) {
            return false;
        }

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static String convertDecimalToBinary(int decimal) {

        StringBuilder binary = new StringBuilder();

        while(decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}