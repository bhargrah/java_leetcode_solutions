package problems;

/**
 * @author rahulbhargava
 * @category 1528. Shuffle String
 * @see https://leetcode.com/problems/shuffle-string/submissions/
 */


public class Solution_1528 {

	public static void main(String[] args) {

		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString("codeleet", indices));

	}

	public static String restoreString(String s, int[] indices) {

		int len = s.length();

		char[] finalArray = new char[len];
		char[] array = s.toCharArray();

		for (int index = 0; index < len; index++) {
			finalArray[indices[index]] = array[index];
		}

		return String.valueOf(finalArray);

	}

}
