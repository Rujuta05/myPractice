package classwork3;

import java.util.Scanner;

public class DistinctCharcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s;
		char sarr[];
		int ascii;
		int ascii_val[];
		int count[],temp=0;
		System.out.println("Enter String here");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
	   sarr= s.toCharArray();
	   ascii_val=new int[sarr.length];
	   
	   count=new int[ascii_val.length];
	   for(int i=0;i<=sarr.length-1;i++)
	   {
		
		   ascii=(int)sarr[i];
		  
		   ascii_val[i]=ascii;
		  
		   for(int j=0;j<i;j++)
		   {
			   if(ascii_val[i]==ascii_val[j])
			   {
				   
				   
				   for(int k=0;k<=j;k++)
				   {
				   count[i]=temp;
				   temp++;
				   if(temp>1)
				   {
				   System.out.println("count of "+sarr[i]+" is "+count[i]);
				   }
				   }
				   
			   }
			  
		   }
		  
		   
	   }
	   

	   
	   
	}

}
