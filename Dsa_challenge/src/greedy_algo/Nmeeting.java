package greedy_algo;

import java.util.Arrays;

public class Nmeeting 
{
	static class Meeting
	{
		int start;
		int end;
		int pos;
		
		Meeting(int s, int e, int p)
		{
			start = s;
			end = e;
			pos = p;
		}
	}

	public static int nmeeting(int[] start,int[] end, int n)
	{
		Meeting[] arr = new Meeting[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = new Meeting(start[i], end[i], i+1);
		}
		
		Arrays.sort(arr,(a,b) -> a.end - b.end);
		
		int count =1;
		int endtime = arr[0].end;
		
		for(int i=1; i<n ;i++)
		{
			if(arr[i].start>endtime)
			{
				count++;
				endtime = arr[i].end;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int[] start = {0,3,1,5,5,8};
		int[] end = {5,4,2,9,7,9};
		System.out.println(nmeeting(start, end, 6));

	}

}
