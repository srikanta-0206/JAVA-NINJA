package com.pattern.practice;
//inverted number pyramid
public class Pattern07 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
