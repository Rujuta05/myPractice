package classwork3;

public class distictchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="ruju";
		int count=0;
		boolean flag;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				System.out.println(s.charAt(i));
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					flag=true;
					System.out.println(s.charAt(j));
				}
			}
		}

	}

}
