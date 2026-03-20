package string;

public class Valid_palindrome 
{

	public static boolean palindrome(String s)
	{
		if(s.length()<1)
		{
			return true;
		}
		
		s = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
		
		int l = 0;
		int r = s.length()-1;
		while(l<=r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				return false;
			}
			else
			{
				l++;
				r--;
			}
		}
		return true;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		String s = "A man, a plan, a canal: Panama";
		System.out.println(palindrome(s));
	}

}
