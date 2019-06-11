package classwork3;

import java.util.Scanner;

public class numPlaindrom {
	
	static boolean isPalindrome(int num)
	{
		int rem,revnum=0;
		int originalnum=num;
		
		while(num!=0)
		{
			rem=num%10;
			revnum=revnum*10+rem;
			num=num/10;
		}
		
		if(originalnum==revnum)
		{
			return true;
		}
			else
			{
			return false;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		int a;
		System.out.println("\n Enter first number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		System.out.println("Is this "+a+" Palindrome "+isPalindrome(a));
		
		

	}

}
