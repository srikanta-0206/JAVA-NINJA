package com.pattern.practice;
//number pyramid
public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++){
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int l=1;l<=(2*i)-1;l++){
               if (l == 1 || l == (2*i) - 1 || i == n)

                   System.out.print(i);
               else
                   System.out.print(" ");
           }
            System.out.println();
        }

     }
    }