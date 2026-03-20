package string;

public class Reverse_string
{
	
	public static String reverse(String p)
	{
		StringBuilder sb = new StringBuilder(p);
		sb.reverse();
		return sb.toString();
	}
	
	
	public static String[] reverses(String[] s)
	{
		if(s.length<=1 )
		{
			return s;
		}
		
		int l=0;
		int r=s.length-1;
		while(l<r)
		{
			 String temp = s[r];
			 s[r] = s[l];
			 s[l] = temp;
			 l++;
			 r--;
		}
		
		return s;
	}
	
	
	
	
	

	public static void main(String[] args)
	{
		String p = "Hello";
		System.out.println(reverse(p));
		String s[] = {"h","e","l","l","o"};
		 System.out.println(reverses(s)+" "); 
	}

}
