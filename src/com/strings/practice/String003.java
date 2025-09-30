package com.strings.practice;

// 3) WAJP to Arrange the Given String
// Logic: Separate digits, specials, alphabets, then join.
// Example: Input: "JSPIDER@123"
// Output: "@123JSPIDER"

public class String003 {
    public static void main(String[] args) {
        String str = "JSPIDER@123";
        String alpha = "";
        String number = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);

            if ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z')) {
                alpha += b;
            } else if (b >= '0' && b <= '9') {
                number += b;
            } else {
                special += b;
            }
        }

        System.out.println(special + number + alpha);
    }
}
