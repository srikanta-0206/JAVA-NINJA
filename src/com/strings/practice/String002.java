package com.strings.practice;

// 2) WAJP to Count Characters (Lowercase, Uppercase, Numbers, Special)
// Logic: Traverse each character. Use ASCII value checks.
// Example: Input: "JSPIDER@123"
// Output: Uppercase=7, Lowercase=0, Numbers=3, Special=1

public class String002 {

    public static void main(String[] args) {
        int upper = 0, lower = 0, number = 0, special = 0;
        String s = "JSPIDER@123";

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);

            if (b >= 'A' && b <= 'Z') {
                upper++;
            } else if (b >= 'a' && b <= 'z') {
                lower++;
            } else if (b >= '0' && b <= '9') {
                number++;
            } else {
                special++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Numbers   = " + number);
        System.out.println("Special   = " + special);
    }
}
