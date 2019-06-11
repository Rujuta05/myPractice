package classwork3;

import java.util.Scanner;

public class String_reverse_char {

	static void strrev_char(String s)
	{
	
		int num,count=0;
		String s_arr[]=s.split(",");
		
		for(String t:s_arr)
		{
			System.out.println(t);
			count++;
		}
		
		System.out.println("\n\tno of words in string "+count);
		System.out.println("\n\t Reverse is");
		for(int i=s_arr.length-1;i>=0;i--)
		{
			System.out.println(s_arr[i]);
		}
		
		
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s;
		System.out.println("Enter String here");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		strrev_char(s);
		
		
	}

}
