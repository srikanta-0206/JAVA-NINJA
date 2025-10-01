package com.strings.practice;

public class String009 {
    public static void main(String[] args) {
        String s = "JAVA IS EASY";
        String word = "";
        String Result = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a != ' ') {
                word = a + word;
            } else {
                Result += word + " ";
                word = "";

            }
        }
        Result = Result + word;
        System.out.println(Result);
    }

}

