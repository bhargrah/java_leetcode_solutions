package problems;

/**
 * @author rahulbhargava
 * @category 126. Remove Duplicates from Sorted Array
 * @see https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class Solution_26 {

	public static void main(String[] args) {

		int[] temp_0 = { };
		System.out.println(removeDuplicates(temp_0));
		
		int[] temp_1 = { 1, 1, 2 };
		System.out.println(removeDuplicates(temp_1));

		int[] temp_2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(temp_2));

	}

	public static int removeDuplicates(int[] nums) {

		int len = nums.length;

		if (len < 1)
			return 0;

		int count = 1;
		int swap = nums[0];

		for (int iCnt = 0; iCnt < len; iCnt++) {

			if (nums[iCnt] != swap) {
				nums[count] = nums[iCnt]; // saving unique in temp array
				count++; // increment the counter if there is a change in value
			}

			swap = nums[iCnt];

		}

		return count;
	}

}
