package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 1790. Check if One String Swap Can Make Strings Equal
 * @see https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */

public class Solution_1790 {

	public static void main(String[] args) {
		System.err.println(areAlmostEqual("aa", "ac"));
		System.err.println(areAlmostEqual("bank", "kanb"));
		System.err.println(areAlmostEqual("yf", "yy"));

	}

	public static boolean areAlmostEqual(String s1, String s2) {

		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		int counter = 0;

		// check if occurrence of character are same or not

		Map<Character, Integer> dict = new HashMap<>();

		for (char element : s1Arr) {
			dict.put(element, dict.getOrDefault(element, 0) + 1);
		}

		for (char element : s2Arr) {
			if (dict.get(element) != null)
				dict.put(element, dict.getOrDefault(element, 0) - 1);

		}

		System.err.println(dict);

		if (dict.values().stream().filter(i -> i > -1).reduce(0, (e1, e2) -> e1 + e2) > 0)
			return false;

		for (int count = 0; count < s1.length(); count++) {
			if (s1Arr[count] != s2Arr[count]) {
				counter = counter + 1;
			}
		}

		return counter < 3;
	}

}
