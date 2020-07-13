package medium;

/**
 * @author rahulbhargava
 * @category 338. Counting Bits
 * @see https://leetcode.com/problems/counting-bits/
 */

public class Solution_338 {

	public static void main(String[] args) {
		countBits(4);
	}


	public static int[] countBits(int num) {
		int[] result = new int[num + 1];

		for (int i = 0; i < num + 1; i++) {
			result[i] = (int) Integer.toBinaryString(i).chars().filter(n -> n == '1').count();
			System.out.println(i + " : " + "Count of 1's: " + result[i]);
		}

		return result;

	}

}
