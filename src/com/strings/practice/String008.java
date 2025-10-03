package com.strings.practice;
//8) WAJP for InitCap (Capitalize First Letter of Each Word)
//Logic: Split words, capitalize first letter.
//Example:
//Input: "java is fun"
//Output: "Java Is Fun"

public class String008 {
public static void main(String[] args) {
	String str = "java is fun";
	String nes = "";
	char [] a = str.toCharArray();
	for (int i=0;i<str.length();i++){
	if(i==0||a[i-1]==' '){
		nes+= (char)(a[i]-32);
	}
	else {
		nes+= a[i];
	}
	
	}
	System.out.println(nes);
	
	
	
	
}
}
