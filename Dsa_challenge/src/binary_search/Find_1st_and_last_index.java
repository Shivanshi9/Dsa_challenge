package binary_search;

public class Find_1st_and_last_index 
{

	public static int[] checkrange(int[] arr,int target)
	{
		int[] res = {-1,-1};
		
		if(arr == null || arr.length == 0)
		{
			return res;
		}
		
		int firstindex = indexfirst(arr, target);
		int lastindex = indexlast(arr, target);
		return new int[] {firstindex,lastindex};
	}
	
	public static int indexfirst(int[] arr, int target)
	{
		int s =0;
		int e = arr.length-1;
		int mid = s+(e-s)/2;
		int ans = -1;
		while(s<=e)
		{
			if(arr[mid]==target)
			{
				ans = mid;
				e = mid+-1;
				
			}
			
			if(arr[mid] < target)
			{
			    s = mid + 1;
			}
			else
			{
			    e = mid - 1;
			}
			 mid = s+(e-s)/2;
		}
		return ans;
	}
	
	public static int indexlast(int[] arr, int target)
	{
		int s =0;
		int e = arr.length-1;
		int mid = s+(e-s)/2;
		int ans = -1;
		while(s<=e)
		{
			if(arr[mid]==target)
			{
				ans = mid;
				s = mid+1;
				
			}
			
			if(arr[mid] < target)
			{
			    s = mid + 1;
			}
			else
			{
			    e = mid - 1;
			}
			 mid = s+(e-s)/2;
		}
		return ans;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		int[] res = checkrange(arr, target);
		for(int val : res)
		{
			System.out.print(val + " ");
		}
	
	}
}
