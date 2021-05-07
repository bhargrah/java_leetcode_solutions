package hard;

import java.util.stream.Stream;

/**
 * @author rahulbhargava
 * @category 72. Edit Distance
 * @see https://leetcode.com/problems/edit-distance/
 */

public class Solution_72 {

	public static void main(String[] args) {

	}

	public int minDistance(String word1, String word2) {

		final int[][] costMatix = new int[word1.length() + 1][word2.length() + 1];

		int CA = 1; // cost of adding a character
		int CD = 1; // cost of deleting a character
		int CT = 1; // cost of transition/swap a character

		// Function (to select minimum of below operations)
		// f(x) = min { i, j-1 -- CA
		// i-1, j -- CD
		// i-1, j-1 -- CT

		// initialize the matrix
		for (int i = 1; i <= word1.length(); i++)
			costMatix[i][0] = i * CD;

		for (int j = 1; j <= word2.length(); j++)
			costMatix[0][j] = j * CA;

		for (int i = 1; i <= word1.length(); i++)
			for (int j = 1; j <= word2.length(); j++) {
				final int costOfTransition = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : CT; // zero cost if elements are same
				costMatix[i][j] = Stream
						         .of(costMatix[i][j - 1] + CA, costMatix[i - 1][j] + CD, costMatix[i - 1][j - 1] + costOfTransition)
						         .min(Integer::compareTo)
						         .orElse(Integer.MAX_VALUE);
			}

		return costMatix[word1.length()][word2.length()]; // return last index which will have minimum of edits 

	}

}
