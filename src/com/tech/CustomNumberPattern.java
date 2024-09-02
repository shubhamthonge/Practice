package com.tech;

public class CustomNumberPattern {
    public static void main(String[] args) {
        // Array of starting numbers for each row
        int[] startNumbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        for (int i = 0; i < startNumbers.length; i++) {
            for (int j = startNumbers[i]; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

