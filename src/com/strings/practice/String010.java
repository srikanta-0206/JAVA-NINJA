package com.strings.practice;

public class String010 {
public static void main(String[] args) {
	String str = "java is easy";
	String res = "";
	String word = "";
	for (int i=str.length()-1;i>=0;i--){
		char a = str.charAt(i);
		if(a!=' '){
			word = a+ word;
		}
		else {
			res+=word+" ";
			word="";
			
		}
		
	}
	res+=word;
	System.out.println(res);
	
}
}
