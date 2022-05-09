package org.logicalprogramms;

public class Vowvels {
public static void main(String[] args) {
	
	String s = " zuneth loves missba so much";
	for(int i=0;i<s.length(); i++) {
		char c = s.charAt(i);
		
		switch(c) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
		
			System.out.println(c);
		
			
		}
	}
	
	
	
}}
