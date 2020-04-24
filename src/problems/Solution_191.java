package problems;

/**
 * @author rahulbhargava
 * @category 191. Number of 1 Bits
 * @see https://leetcode.com/problems/number-of-1-bits/
 */

public class Solution_191 {

	public static void main(String[] args) {
		int sample = 00000000000000000000000000001011;//11111111111111111111111111111101;
		System.out.println(hammingWeight(sample));
	}

	public static int hammingWeight(int n) {

		int oneCount = 0;

		if (n > 0) {
			while (n > 0) { // positive ints

				if (n % 2 == 1)
					oneCount++;
				n = n / 2;
			}
		} else if (n < 0) { // negative ints
			n = (n * -1) - 1; // making it positive
			while (n != 0) {
				if (n % 2 == 1)
					oneCount++;
				n = n / 2;
			}
			oneCount = 32 - oneCount;
		}

		return oneCount;

	}

}
