package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 383. Ransom Note
 * @see https://leetcode.com/problems/ransom-note/
 */

public class Solution_383 {

	public static void main(String[] args) {

		String ransomNote = "aaa";
		String magazine = "aab";

		System.out.println(canConstruct(ransomNote, magazine));

	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		boolean canConstruct = false;

		if(ransomNote.isEmpty() && magazine.isEmpty() || ransomNote.isEmpty()) return true;
		
		if (magazine.length() < ransomNote.length())
			return false;

		Map<Character, Integer> dict = new HashMap<>();
		for (char element : magazine.toCharArray()) {
			dict.put(element, dict.getOrDefault(element, 0) + 1);
		}

		for (char element : ransomNote.toCharArray()) {
			if (dict.get(element) != null && dict.get(element) !=0) {
				dict.put(element, dict.get(element) - 1);
				canConstruct = true;
			} else {
				return false;
			}
		}

		System.out.println(dict);

		return canConstruct;

	}

}
