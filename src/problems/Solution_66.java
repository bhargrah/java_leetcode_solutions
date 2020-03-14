package problems;

/**
 * @author rahulbhargava
 * @category 66 . Plus One
 * @see https://leetcode.com/problems/plus-one/
 */

public class Solution_66 {

	public static void main(String[] args) {

		int[] input = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
				1, 1, 7, 4, 0, 0, 6 };

		plusOne(input);

	}

	public static int[] plusOne(int[] digits) {

		int finalDigit = digits[digits.length - 1];
		boolean carryForward = false;

		if (finalDigit < 9) {
			
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			
		} else {

			for (int iCnt = digits.length - 1; iCnt >= 0; iCnt--) {

				if (digits[iCnt] >= 9) {

					if (iCnt == 0) { // end of of the array , so needs to increase the size of final array

						digits = new int[digits.length + 1];
						digits[iCnt] = 1;
						return digits;

					}
					
					digits[iCnt] = 0;
					carryForward = true;
					continue;
				}

				if (carryForward) { 
					digits[iCnt] = digits[iCnt] + 1;
					carryForward = false;
					break;
				}

			}
		}

		return digits;
	}

}
