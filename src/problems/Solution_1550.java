package problems;

/**
 * @author rahulbhargava
 * @category 1550. Three Consecutive Odds
 * @see https://leetcode.com/problems/three-consecutive-odds/
 */

public class Solution_1550 {

	public static void main(String[] args) {

		int[] input1 = { 2, 6, 4, 1 };
		int[] input2 = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };

		System.out.println(threeConsecutiveOdds(input1));

	}

	public static boolean threeConsecutiveOdds(int[] arr) {

		int index = 0;
		boolean isOdd = false;

		for (int iCnt = 0; iCnt < arr.length; iCnt++) {

			if (arr[iCnt] % 2 != 0) {
				index = index + 1;
				System.out.println("arr[iCnt] : " + arr[iCnt] + ", index :" + index);
			} else {
				index = 0;
				System.out.println("arr[iCnt] : " + arr[iCnt] + ", index :" + index);

			}

			if (index == 3) {
				isOdd = true;
				break;
			}

		}

		return isOdd;
	}

}
