package problems;

/**
 * @author rahulbhargava
 * @category 371. Sum of Two Integers
 * @see https://leetcode.com/problems/sum-of-two-integers/
 */

public class Solution_371 {

	public static void main(String[] args) {
		System.out.println("-1 + 3 = "+getSum(-1, 3));
		System.out.println("1 + 3 = "+getSum(1, 3));
	}

	public static int getSum(int a, int b) {

		// keep iterating till we have no carry forward
		while (b != 0) {

			// check for carry forward
			int carry = a & b;

			// do addition of two numbers
			a = a ^ b;

			// shifting the carry for further addition
			b = carry << 1;

		}

		return a;

	}

}
