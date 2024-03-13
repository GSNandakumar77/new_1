package main.java.javabeginner.arrray;
import java.util.*;
import java.util.Arrays;

class ArrayMissing {

	// Function to find the missing number
	public static int getMissingNo(int[] nums, int n)
	{
	int sum = 0;
		for(int i=0;i<n;i++){
            System.out.println(i);
			sum = sum + nums[i];
		}
		return ((n * (n+1))/2 - sum);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1,2,3,4,6,8,7 };
		int N = arr.length;
		System.out.println(getMissingNo(arr, N));
	}

}