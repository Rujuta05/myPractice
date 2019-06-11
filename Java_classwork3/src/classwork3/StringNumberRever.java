package classwork3;

import java.util.Scanner;

public class StringNumberRever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		int n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter String :");
		s=sc.nextLine();
		
		n=Integer.parseInt(s);
		
		while(n!=0)
		{
		 rev=rev*10;      
		 rev=rev+n%10;
		 n=n/10;
		}
		
		System.out.println("\t reverse number is "+rev);
		
		
	}

}
