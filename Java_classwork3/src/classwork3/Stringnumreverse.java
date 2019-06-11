package classwork3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Stringnumreverse {
	
	static void strrev_num(String s)
	{
	
		int num;
		String s_arr[]=s.split(",");
		int arr[]=new int[10];
		int temp;
		
		for(int i=0;i<s_arr.length;i++)
		{
		System.out.println("\t -"+s_arr[i]);
		
		arr[i]=Integer.parseInt(s_arr[i]);
			
		}
		
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
			
		System.out.println("\t"+Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		System.out.println("Enter String here");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		strrev_num(s);
		
		
	}

}
