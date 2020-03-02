package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 283. Move Zeroes
 * @see https://leetcode.com/problems/move-zeroes/
 */
public class Problem_283 {

	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 36, 8, 0, 0, 12 };
		moveZeroes(input);
	}

	public static void moveZeroes(int[] nums) {
		System.out.println("Input - " + Arrays.toString(nums));
		
		int lenght = nums.length;
		int temp = 0;
		for (int iCnt = 0; iCnt < lenght; iCnt++) {
			for (int jCnt = 0; jCnt < lenght - 1; jCnt++) {
				if (nums[jCnt] == 0) {
				    temp = nums[jCnt];
					nums[jCnt] = nums[jCnt + 1];
					nums[jCnt + 1] = temp;
				}
			}
		}

		System.out.println("Output - " + Arrays.toString(nums));

	}

}
