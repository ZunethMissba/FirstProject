package org.logicalprogramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfProgramms {
	
	
	static String CheckingPrimeNo(int a) {
		int b =  0;
		for (int  i=2; i< a; i++) {
			if  (a%i==0) {
				b++;
				break;
			}
			
	}
		if (b==0) {
			return "primme no";
		}else {
			return " not  a prime number";
		}
		

}
	static String PolindromeNumber(int a) {
		int rev = 0;
		int temp = a;
		while (a>0) {
			int b=a/10;
			int c = a%10;
		
		rev = c +(rev*10);
		a=b;
		
		}
		if (temp == rev) {
			return "polindrome no";
			
		}else {
			return"not a polindrome no";
		}

	}
	static int  ReversetheNumber(int a) {
      int rev = 0;
      int temp = a;
      while (a>0) {
    	  int b = a/10;
    	  int c = a%10;
    	  rev = c+(rev*10);
      a=b;
      }
      return rev;
      
	}
	static int CountofNumber(int a) {
		int count = 0;
		while(a>0) {
			int b = a/10;
			int c1 = a%10;
			count++;
			a = b;
		}
		return count;

	}
	static int SumofNumber(int a) {
int sum = 0;
while(a>0) {
	int b = a/10;
	int c = a%10;
	sum = sum+c;
	a=b;
}
return sum;
	}
	static String reverseString(String input) {
		String rev ="";
for(int i= input.length()-1;i>=0;i--) {
	rev = rev+input.charAt(i);
}
return rev;

	}
	static String polindromeString(String input) {
		String rev ="";
		String temp = input;
		for(int i = input.length()-1; i>=0; i--) {
			rev = rev+input.charAt(i);
			
			
		}
		if (temp.equals(rev)) {
			return"polindrome string";
			
		}else {
			return " non polindrome String";
		}
		

	}
static Map<Character, Integer> occuranceOfCharacter(String s) {
	
	char[]c = s.toCharArray();
	Map<Character, Integer> m = new LinkedHashMap();
	for(int i=0; i<c.length;i++) {
		if (m.containsKey(c[i])) {
			Integer d= m.get(c[i]);
			m.put(c[i], d+1);
			
		}else {
			m.put(c[i], 1);
		}
		
	}
	return m;

}	




	public static void main(String[] args) {
		String checkingPrimeNo = CheckingPrimeNo(7);
		System.out.println(checkingPrimeNo);
	String polindromeNumber = PolindromeNumber(1234321);
	System.out.println(polindromeNumber);
	int reversetheNumber = ReversetheNumber(12345);
	System.out.println(reversetheNumber);
	int countofNumber = CountofNumber(1234);
	System.out.println(countofNumber);
	int sumofNumber = SumofNumber(1234);
	System.out.println(sumofNumber);
	String reverseString = reverseString("zunethmissba");
	System.out.println(reverseString);
	String polindromeString = polindromeString("malayalam");
	System.out.println(polindromeString);
	Map<Character, Integer> occuranceOfCharacter = occuranceOfCharacter("javais A language");
	System.out.println(occuranceOfCharacter );
	
	
	int [] a = {100, 120, 140, 123, 58, 6, 44, 25};
	for (int i = 0; i<a.length; i++) {
		for(int j=i+1; j<a.length;j++) {
			if (a[j]>a[i]) {
				int temp = a[i];
				a[i]=a[j];
				a[j] = temp;
				
			}
		}
		}
	for(int i=0; i<a.length;  i++) {
		System.out.println(a[i]+" ");
	}


	
	
	}
}