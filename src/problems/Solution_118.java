package problems;

import java.util.ArrayList;
import java.util.List;
/**
 * @author rahulbhargava
 * @category 118. Pascal's Triangle
 * @see https://leetcode.com/problems/pascals-triangle/
 */

public class Solution_118 {

	public static void main(String[] args) {
		generate(5);
	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		List<Integer> result = new ArrayList<>();

		for (int iCnt = 1; iCnt <= numRows; iCnt++) {
			result = createList(result);
			finalResult.add(result);
		}

		System.out.println(finalResult);
		return finalResult;
	}

	private static List<Integer> createList(List<Integer> result) {

		if (result.size() == 0) {
			result.add(1);
			return result;
		}

		List<Integer> tmpResult = new ArrayList<>();
		tmpResult.add(1);
		for (int iCnt = 0; iCnt < result.size() - 1; iCnt++) {
			tmpResult.add(result.get(iCnt) + result.get(iCnt + 1));
		}
		tmpResult.add(1);
		return tmpResult;
	}

}
