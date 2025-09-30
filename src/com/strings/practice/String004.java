package com.strings.practice;
//4) WAJP to Count Vowels in a String
//Logic: Check each char if it is a vowel (a, e, i, o, u).
//Example:
//Input: "BISHNU"
//Output: 2

public class String004 {
    public static void main(String[] args) {
        String str = "aeiou";
        int count =0;
        for (int i=0;i<str.length();i++){
            char b = str.charAt(i);
            if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                count++;
            }

        }
        System.out.println("vowel"+" ="+ count);
    }
}
