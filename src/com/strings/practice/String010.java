package com.strings.practice;

public class String010 {
public static void main(String[] args) {
	String s = "JAVA IS EASY";
	String word = "";
	String result = "";
	for (int i=s.length()-1;i>=0;i--){
		char a = s.charAt(i);
		if(a!=' '){
			word=a+word;
			
		}
		else {
			result+=word+" ";
			word="";
		}
		
	}
	result+=word;
	System.out.println(result);
}
}
