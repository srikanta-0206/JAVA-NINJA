package com.strings.practice;
//6) WAJP to Check Palindrome String
//Logic: Compare string with its reverse.
//        Example:
//Input: "madam" → Palindrome
//Input: "hello" → Not Palindrome
//
//---
public class String006 {
    public static void main(String[] args) {
        String str = "madam";
        String pal ="";
        for(int i=str.length()-1;i>=0;i--){
            pal += str.charAt(i);

        }
        if (pal.equals(str)){
            System.out.println("is a palindrom");

        }
        else {
            System.out.println("not a ");
        }
    }
}
