package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 66 . Plus One
 * @see https://leetcode.com/problems/plus-one/
 */

public class Solution_66 {

	public static void main(String[] args) {

		int[] input = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
				1, 1, 7, 4, 0, 0, 6 };

		System.out.println(Arrays.toString(plusOne(input)));

	}

	
	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0; // marking

		}

		int[] result = new int[digits.length + 1];
		result[0] = 1;

		return result;
	}

}
