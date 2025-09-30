package com.pattern.practice;

// palindrome pyramid
public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print left half (descending)
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // print right half (ascending, start from 2 to avoid duplicate middle)
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
