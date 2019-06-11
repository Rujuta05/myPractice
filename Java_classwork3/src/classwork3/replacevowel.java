package classwork3;

public class replacevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="shruthi";
		char a[]=new char[s.length()];
		String res="";
		int j=0;
		
		System.out.println("given string is: "+s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				
				a[j]=s.charAt(i);
					j++;			
			}
		}
		System.out.println(a);
			
		for(int i=0;i<s.length();i++)
			{
			j=0;
			//res=s.replace(oldChar, newChar);
			j++;
			}
		
		System.out.println(res);
	}

}
