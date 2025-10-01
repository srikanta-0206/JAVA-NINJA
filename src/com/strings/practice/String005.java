package com.strings.practice;

//5) WAJP to Sum Digits in an Alphanumeric String
//Logic: Traverse string, if char is digit → add to sum.
//        Example:
//Input: "JSPIDER@123"
//Output: 6
public class String005 {

    public static void main(String[] args) {
    String s="JSPIDER@123";
    int sum=0;

    for (int i=0;i<s.length();i++){
        char a = s.charAt(i);
        if(a>='0' && a<='9'){
            sum+=a-'0';
        }

    }
        System.out.println(sum);
    }
}
