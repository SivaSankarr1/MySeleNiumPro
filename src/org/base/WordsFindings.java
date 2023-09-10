package org.base;

public class WordsFindings {
public static void main(String[] args) {
	int space=0;
String s="Hi I am Sivasankar from chennai";
int length = s.length();
System.out.println(length);
for (int i = 0; i <length; i++) {
	char charAt = s.charAt(i);
	
	if(charAt==' ') {
		space++;
	}
}
System.out.println("Total number of words in the String is"+space+1);
}
}
