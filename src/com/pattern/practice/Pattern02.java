package com.pattern.practice;
//inverted pyramid
public class Pattern02 {


    public static void main(String[] args) {
        int n = 6;
        for (int i=n;i>=1;i--){
                for (int j = 1; j<=i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}

