
/**
 * @author rahulbhargava
 * @category 500. Keyboard Row
 * @see https://leetcode.com/problems/keyboard-row/
 */

package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_500 {
	public static void main(String[] args) {

		String[] words0 = { "Hello", "Alaska", "Dad", "Peace" };
		String[] words1 = { "abdfs", "cccd", "a", "qwwewm" };
		String[] words2 = { "cccd", "cccd", "a" };
		String[] words = { "cccd" };

		System.out.println(findWords(words0));
		System.out.println(findWords(words1));
		System.out.println(findWords(words2));

	}

	public static String row_1 = "qwertyuiop";
	public static String row_2 = "asdfghjkl";
	public static String row_3 = "zxcvbnm";

	public static Set<String> row1 = new HashSet<>();
	public static Set<String> row2 = new HashSet<>();
	public static Set<String> row3 = new HashSet<>();

	public static void populate() {
		for (Character element : row_1.toCharArray())
			row1.add(element.toString());
		for (Character element : row_2.toCharArray())
			row2.add(element.toString());
		for (Character element : row_3.toCharArray())
			row3.add(element.toString());
	}

	public static String[] findWords(String[] words) {
		populate();

		List<String> result = new ArrayList<>();

		for (String word : words) {

			if (wordInRow(word, row1)) {
				result.add(word);
				continue;
			}
			if (wordInRow(word, row2)) {
				result.add(word);
				continue;
			}
			if (wordInRow(word, row3)) {
				result.add(word);
				continue;
			}

		}

		System.out.println(result);
		return result.toArray(new String[result.size()]);

	}

	public static boolean wordInRow(String word, Set<String> dict) {
		int count = 0;
		boolean flag = false;
		word = word.toLowerCase();

		for (Character element : word.toCharArray()) {

			if (dict.contains(element.toString())) {
				count = count + 1;
			}

			if (count == word.length()) {
				flag = true;
			}

		}
		return flag;

	}

}
