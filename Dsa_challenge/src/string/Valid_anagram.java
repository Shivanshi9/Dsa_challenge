package string;

import java.util.Iterator;

public class Valid_anagram 
{

	public static boolean anagram(String s, String t)
	{
		int[] freq = new int[26];
		if(s.length()!=t.length())
		{
			return false;
		}
		
			for(int j=0; j<s.length();j++)
			{
				freq[s.charAt(j)-'a']++;
			}
			
			for(int j=0; j<s.length();j++)
			{
				freq[t.charAt(j)-'a']--;
			}
		
			for(int count : freq)
			{
				if(count !=0)
				{
					return false;
				}
			}
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
//		Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//				Example 1:
//				Input: s = "anagram", t = "nagaram"
//				Output: true
		String s = "anagram";
		String target = "nagaram";
		System.out.println(anagram(s,target));
	}

}
