package classwork3;

import java.util.Scanner;

public class swapstring {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="world";
		
		s1=s1.concat(s2);
		
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s1.length()-s2.length(),s1.length());
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
