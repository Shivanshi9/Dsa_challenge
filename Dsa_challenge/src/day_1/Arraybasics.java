package day_1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Arraybasics 
{

	// LINEAR SEARCH 
	public static int ls(int[] arr, int x)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	
	// BINARY SEARCH
	public static int bs(int[] arr, int x)
	{
		int s = 0;
		int e = arr.length-1;
		int m = s+(e-s)/2;
		
		while(s<=e)
		{
			if(arr[m]==x)
			{
				return m;
			}
			
			if(arr[m]<x)
			{
				s = m+1;
			}
			else
			{
				e = m-1;
			}
			m = s+(e-s)/2;
		}
		return -1;
	}
	
	// FIND MAX/MIN -> time complexity - O(n) , space - O(1)
	 
	public static void maxmin(int[] arr)
	{
		int min = Integer.MAX_VALUE; // +infinity
		int max = Integer.MIN_VALUE; // -infinity
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			else if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Min "+min);
		System.out.println("Max "+max);
	}
	
	// 2nd LARGEST for non-neegative array
	public static int seclargest(int[] arr)
	{
		int max = arr[0];
		int secmax = -1;
		
		for(int i=1; i<arr.length;i++)
		{
		   if(arr[i]>max)
		   {
			   if(secmax<max)
			   {
				   secmax = max;
			   }
			  
			   max = arr[i];  
		   }
		}
		return secmax;
	}
	
	// k-th largest without sorting
	 public static int findKthLargest(int[] arr, int k) {

	        // Step 1: Create min heap
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        // Step 2: Insert first k elements
	        for (int i = 0; i < k; i++) {
	            minHeap.add(arr[i]);
	        }

	        // Step 3: Process remaining elements
	        for (int i = k; i < arr.length; i++) {

	            if (arr[i] > minHeap.peek()) {
	                minHeap.poll();        // remove smallest
	                minHeap.add(arr[i]);   // insert larger element
	            }
	        }

	        // Step 4: Root is kth largest
	        return minHeap.peek();
	    }
	
	// REMOVE DUPLICATES USING TWO POINTERS IN-PLACE
	 public static int removeduplicates(int[] arr)
	 {
		 int i = 0;
		 for(int j=1; j<arr.length;j++)
		 {
			 if(arr[i]!=arr[j])
			 {
				arr[i+1] = arr[j];
				i++;
			 }
		 }
		 return i+1; 
	 }
	 
	
	 // APROACH-1: LEFT ROTATE ARRAY BY 1 PLACE
	 // this approach has many swaps lets optimize it
	 public static int[] leftrotate(int[] arr)
	 {
		 int i=0,j=i+1;
		 while(j<arr.length)
		 {
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j++;
		 }
		return arr;
	 }
	 
	 //APPROACH-2: LESS SWAPS AND CLEANER (RIGHT ROTATE)
	 public static int[] RR(int[] arr)
	 {
		 int i = arr[arr.length-1];  //4
		 
		  for(int j = arr.length - 1; j > 0; j--)
		    {
		        arr[j] = arr[j - 1];
		    }

		    arr[0] = i;
		 return arr;
	 }
	 
	 //RIGHT ROTATE BY 1 PLACE
	 public static int[] rightrotate(int[] arr)
	 {
		 int i=arr.length-1,j=i-1;
		 while(j>=0)
		 {
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i--;
			 j--;
		 }
		return arr;
	 }
	 
	 //ROTATE BY K PLACE
	 public static int[] rightrotatek(int[] arr,int k)
	 {
		 
		 for(int p =0; p<k; p++)
		 {
			 int i=arr.length-1,j=i-1;
			 while(j>=0)
			 {
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 i--;
				 j--;
			 }
		 }
		
		return arr;
	 }
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args)
	{
		//linear search
//		int[] arr = {2,4,7,1,8,0,2,4,67};
//		int x = 67;
//		System.out.println(ls(arr, x));
//		
//		//binary search
//		System.out.println(bs(arr, x));
//		
//		//max min
//		maxmin(arr);
//		
//		//2nd max
//		System.out.println(seclargest(arr));
//		
//		//k-th largest
//		int k =4;
//		System.out.println("kth largest - "+findKthLargest(arr, k));
//		
//		//remove duplicates
//		int[] arr1 = {0,0,1,1,1,2,2,3,4};
//		System.out.println(removeduplicates(arr1));
//		
//		//left rotate
//	        int[] result = leftrotate(arr);
//	        System.out.println(Arrays.toString(result));
//	        
	    //right rotate
//		int[] arr = {0,0,1,1,1,2,2,3,4};
//	    int[] result2 = rightrotate(arr);
//	    System.out.println(Arrays.toString(result2));
		
		//better right rotate
//		int[] arr = {0,0,1,1,1,2,2,3,4};
//	    int[] result2 = RR(arr);
//	    System.out.println(Arrays.toString(result2));
	    
	    //right rotate by k place
	    int k=3;
	    int[] arr = {0,0,1,1,1,2,2,3,4};
	    int[] result2 = rightrotatek(arr,k);
	    System.out.println(Arrays.toString(result2));
	    
	}

}
