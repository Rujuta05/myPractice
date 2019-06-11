package classwork3;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter String :");
		s=sc.nextLine();
		
		System.out.println("String give is "+s);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of string is: "+rev);
	}

}
