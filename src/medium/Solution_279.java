package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 279. Perfect Squares
 * @see https://leetcode.com/problems/perfect-squares/submissions/
 */

public class Solution_279 {

	public static void main(String[] args) {
		Solution_279 problem = new Solution_279();
		System.out.println(problem.numSquares(5238));
	}

	public int numSquares(int n) {

		// 1. Construct array of numbers with squares
		int size = (int) (Math.sqrt(n)); // little hack to control input array
		int[] squareTable = new int[size+1];
		for (int i = 1; i < size + 2; i++) {
			squareTable[i - 1] = i * i;
		}
		
		//System.out.println(Arrays.toString(squareTable));

		// 2. Then apply DP with number and new array created
		Map<Integer, int[]> memo = new HashMap<>();
		System.out.println(Arrays.toString(numSquares(n, squareTable , memo)));
		int [] result = numSquares(n, squareTable, memo);
		return result!=null ? result.length : -1;
	}

	private int[] numSquares(int sum, int[] squareTable, Map<Integer, int[]> memo) {

		if (memo.get(sum) != null)
			return memo.get(sum);
		
		if (sum == 0)
			return new int[0];
		if (sum < 0)
			return null;

		int[] leastNumber = null;

		for (int element : squareTable) {
			int remainder = sum - element;
			int[] result = numSquares(remainder, squareTable, memo);

			if (result != null) {
				int len = result.length;
				int[] finalResult = new int[len + 1];
				System.arraycopy(result, 0, finalResult, 0, len);
				finalResult[len] = element;

				if (leastNumber == null || leastNumber.length > finalResult.length)
					leastNumber = finalResult;
			}
		}

		memo.put(sum,leastNumber);
		return leastNumber;

	}

}
