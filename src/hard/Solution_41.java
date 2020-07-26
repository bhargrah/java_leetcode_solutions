package hard;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 41. First Missing Positive
 * @see https://leetcode.com/problems/first-missing-positive/
 */

public class Solution_41 {

	public static void main(String[] args) {

		int number = 0;

		/*
		 * int[] nums = { 0, 3, 4, 7, 1 }; // 2 should be returned , after 0 & 1 , 2 is
		 * the smallest number missing number = firstMissingPositive(nums);
		 * System.out.println(number);
		 * 
		 * int[] nums2 = { 0, 2, 1 }; number = firstMissingPositive(nums2);
		 * System.out.println(number);
		 * 
		 * int[] nums3 = { 3, 4, -1, 1 }; number = firstMissingPositive(nums3);
		 * System.out.println(number);
		 */

		int[] nums4 = {1,2};
		number = firstMissingPositive(nums4);
		System.out.println(number);

	}

	public static int firstMissingPositive(int[] nums) {
		int len = nums.length;
		int indexOfSmallestPositive = len+1;
		
		if(len==0) return 1;
		System.out.println(Arrays.toString(nums));

		// Clean up the array which will take O(n)
		for(int count = 0 ; count < len ; count++ ) {
			if(nums[count] < 1) nums[count] = len+1;
		}
		System.out.println(Arrays.toString(nums));

		// Mark all the indexes entries as "-1" which are visited
		for(int count = 0 ; count < len ; count++) {
			int indexToUpdate = Math.abs(nums[count]) - 1; // index stars from zero
			
			// do nothing if index < 0 or index > len
			if(indexToUpdate < 0 || indexToUpdate >= len) 
				continue;
			
			//marking it as -ve to indiate that index is visited already
			if(nums[indexToUpdate] > 0) {
				nums[indexToUpdate] = nums[indexToUpdate] * -1;
			}
		}
		System.out.println(Arrays.toString(nums));

		for (int count = 0; count < len; count++) {
			if (nums[count] > 0) {
				indexOfSmallestPositive = count + 1;
				break;
			} 
		}
		
		return indexOfSmallestPositive;

	}
}
