package problems;

/**
 * @author rahulbhargava
 * @category 268. Missing Number
 * @see https://leetcode.com/problems/missing-number/
 */
public class Solution_268 {

	public static void main(String[] args) {
		int[] input = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(input));
	}

	public static int missingNumber(int[] nums) {

		int length = nums.length;
		int total = (length * (length + 1) / 2); // Calculating total  sum (n*(n+1))/2

		for (int iCnt = 0; iCnt < length; iCnt++)
			total = total - nums[iCnt];

		return total == 0 ? 0 : total;

	}

}
