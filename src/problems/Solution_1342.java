package problems;

/**
 * @author rahulbhargava
 * @category 1342. Number of Steps to Reduce a Number to Zero
 * @see https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

public class Solution_1342 {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(0));
		System.out.println(numberOfSteps(14));
	}

	public static int numberOfSteps(int num) {

		int totalSteps = 0;

		while (num != 0) {

			boolean isEven = (num % 2 == 0) ? true : false;
			if (isEven) {
				num = num / 2;
			} else {
				num = num - 1;
			}

			totalSteps++;
		}

		return totalSteps;

	}
}
