package com.strings.practice;
//8) WAJP for InitCap (Capitalize First Letter of Each Word)
//Logic: Split words, capitalize first letter.
//Example:
//Input: "java is fun"
//Output: "Java Is Fun"

public class String008 {
    public static void main(String[] args) {
        String str ="java is fun";
        String nes = "";

        for (int i =0;i<str.length();i++){
            char b = str.charAt(i);
           if(i==0||str.charAt(i-1)==' ') {
               if (b >= 'a' && b <= 'z') {
                   b = (char) (b - 32);
               }
           }
            nes+=b;

        }
        System.out.println(nes);
    }
}
