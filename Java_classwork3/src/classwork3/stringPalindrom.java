package classwork3;

public class stringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="madam";
		String rev="";
		
		int l=s1.length();
		
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}

		if(s1.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("not a plaindrome");
	}

}
