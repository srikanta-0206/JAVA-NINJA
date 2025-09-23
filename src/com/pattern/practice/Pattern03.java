package com.pattern.practice;
//number pyramid
public class Pattern03 {
    public static void main(String[] args) {
        int n = 69 ;
        for (int line = 1; line<=n;line++){
            for(int star = 1;star<=line;star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
