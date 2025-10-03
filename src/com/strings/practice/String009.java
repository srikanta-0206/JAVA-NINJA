package com.strings.practice;
//9) WAJP to Reverse Words and Sentences
//Logic:
//- Reverse each word → split + reverse.
//- Reverse whole sentence → split words, reverse order.
//		                                                Example:
//Input: "JAVA IS EASY"
//Output (reverse words): "AVAJ SI YSAE"
//Output (reverse sentence): "EASY IS JAVA"
//
//		                         ---

public class String009 {
public static void main(String[] args) {
	String str = "java is easy";
	String res = "";
	String word = "";
	for (int i=0;i<str.length();i++){
		char a = str.charAt(i);
		if(a!=' '){
			word = a + word;
		}
		else{
			res+=word+ " ";
			word="";
		}
	}
	res += word;
	System.out.println(res);
}
}
