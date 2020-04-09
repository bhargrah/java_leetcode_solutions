package problems;

/**
 * @author rahulbhargava
 * @category 69. Sqrt(x)
 * @see https://leetcode.com/problems/sqrtx/	
 */

public class Solution_69 {

	public static void main(String[] args) {

		mySqrt(8);

	}

	public static int mySqrt(int x) {

		Double result = Math.sqrt(x);
		return result.intValue();

	}

}
