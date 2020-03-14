package problems;

/**
 * @author rahulbhargava
 * @category 344. Reverse String
 * @see https://leetcode.com/problems/reverse-string/
 */
public class Solution_344 {

	public static void main(String[] args) {
		String input = "hello";
		reverseString(input.toCharArray());
	}

	public static void reverseString(char[] s) {

		int length = s.length;
		char swap;

		for (int iCnt = 0; iCnt < length / 2; iCnt++) {
			swap = s[iCnt];
			s[iCnt] = s[(length - 1) - iCnt];
			s[(length - 1) - iCnt] = swap;
		}

	}

}
