package com.pattern.practice;
//rombus
public class Pattern11 {
    public static void main(String[] args) {
        int n = 10;
        for (int i=1;i<=n;i++){
            for (int k =1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
