package com.strings.practice;

/*
 * 1) WAJP to Reverse a String
 * Logic: Traverse the string from end to start or use StringBuilder.reverse().
 * Example:
 * Input:  "BISHNU"
 * Output: "UNHSIB"
 */
public class String001 {
    public static void main(String[] args) {
        String s = "Bando";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
    }
}
