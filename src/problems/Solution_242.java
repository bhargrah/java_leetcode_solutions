package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 242. Valid Anagram
 * @see https://leetcode.com/problems/valid-anagram/
 */

public class Solution_242 {

	public static void main(String[] args) {

		String s = "ab", t = "a";
		System.out.println(isAnagram(s, t));

	}

	public static boolean isAnagram(String s, String t) {

		boolean isAnagram = false;
		
		if(s.equals("") &&  t.equals("")) return true;

		Map<Character, Integer> dict = new HashMap<>();

		for (char alphabet : s.toCharArray()) {
			if (dict.get(alphabet) == null) {
				dict.put(alphabet, 1);
			} else {
				dict.put(alphabet, dict.get(alphabet) + 1);
			}
		}

		for (char alphabet : t.toCharArray()) {
			Integer frequency = dict.get(alphabet);
			if (frequency == null) {
				isAnagram = false;
				break; // not an anagram
			} else {
				if (frequency == 1)
					dict.remove(alphabet);
				else
					dict.put(alphabet, dict.get(alphabet) - 1);
			}
			isAnagram = true;
		}

		if(!dict.isEmpty()) isAnagram = false; // check if dict is empty or not
		
		return isAnagram;
	}

}
