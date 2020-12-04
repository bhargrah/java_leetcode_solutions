package problems;

/**
 * @author rahulbhargava
 * @category 1662. Check If Two String Arrays are Equivalent
 * @see https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
 */

public class Solution_1662 {
	public static void main(String[] args) {

		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };

		System.out.println(arrayStringsAreEqual(word1, word2));

	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		String finalWord1 = "";
		String finalWord2 = "";
		
		for(String element : word1)
			finalWord1 = finalWord1 + element;
		
		for(String element : word2)
			finalWord2 = finalWord2 + element;
		
		return finalWord1.equals(finalWord2);

	}

}
