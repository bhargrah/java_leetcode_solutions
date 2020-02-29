package problems;

import java.util.ArrayList;

/**
 * @author rahulbhargava
 * @category 739. Daily Temperatures
 * @see https://leetcode.com/problems/daily-temperatures/
 */
public class Problem_739 {

	public static void main(String[] args) {

		int[] T = { 73, 74, 75, 71, 69, 72, 76, 73 };

		int length = T.length;
		ArrayList<Integer> final_list = new ArrayList<>(length);
		int[] output = new int[length];

		for (int iCnt = 0; iCnt < length; iCnt++) {
			if (!innerLoop(T, final_list, length, iCnt))
				final_list.add(0); // to handle edge scenarios where there are no high temperature
		}

		length = 0; // reusing the variable
		for (int number : final_list) output[length++] = number;
		System.out.println(final_list);
	}

	private static boolean innerLoop(int[] input, ArrayList<Integer> final_list, int length, int iCnt) {
		boolean appendZero = false;
		for (int jCnt = iCnt + 1; jCnt < length; jCnt++) {
			if (input[iCnt] < input[jCnt]) {
				final_list.add(jCnt - iCnt);
				return true;
			}
		}
		return appendZero;
	}

}
