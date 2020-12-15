package com.lambda.remove.duplicates;

/*
 * Type: Solution
 * Name: Jorge Alberto Correa Reyes (Lambda)
 * Date: December 14 2020
 * Level: Easy
 * Platform: Leetcode
 * */

public class RemoveDuplicatesSorted {
	
	public static int removeDuplicates(int[] nums) {

		int p1 = 0;
		int p2 = p1 + 1;
		
		if(nums.length == 0) {
			return 0;
		}

		for (int indice = 0; indice < nums.length - 1; indice++) {

			if (nums[p1] != nums[p2]) {
				p1++;
				
				if(p1 != p2) {
					// copy number
					nums[p1] = nums[p2];
				}
			}

			p2++;
		}

		return p1 + 1;
	}
	
	
	//Only for test
	public static int[] getNewArray(int[] nums, int length) {

		int[] array = new int[length];
		System.arraycopy(nums, 0, array, 0, length); ;

		return array;
	}

}
