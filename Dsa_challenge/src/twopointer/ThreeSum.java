package twopointer;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum 
{

	//Optimal approach -> using array-list and stopping duplicates from creating
	
	
	
	// Not optimal approach
//	public static Set<List<Integer>> threesum(int[] arr, int target)
//	{
//		Set<List<Integer>> set = new HashSet<>();
//		
//		if(arr == null || arr.length < 3)
//		{
//			return set;
//		}
//		
//		Arrays.sort(arr);
//		for(int i=0; i<arr.length ; i++)
//		{
//			int l = i+1;
//			int r = arr.length-1;
//			int sum = 0;
//			while(l<r)
//			{
//				sum = arr[i]+arr[l]+arr[r];
//				if(sum == target)
//				{
//					set.add(Arrays.asList(arr[i],arr[l],arr[r]));
//					l++;
//					r--;
//				}
//				else if(sum > target)
//				{
//					r--;
//				}
//				else
//				{
//					l++;
//				}
//			}
//		}
//		return set;
//	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {-1,0,1,2,-1,-4};
		int target = 0;
		System.out.println(threesum(arr, target));
	}

}
