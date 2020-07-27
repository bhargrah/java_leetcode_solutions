package problems;

/**
 * @author rahulbhargava
 * @category 520. Detect Capital
 * @see https://leetcode.com/problems/detect-capital/
 */

public class Solution_520 {

	public boolean detectCapitalUse(String word) {
		char[] elements = word.toCharArray();

		int len = elements.length;
		int capitalAplhabet = 0;
		int lowerAplhabet = 0;

		for (char element : elements) {

			int asciiVal = (int) element;
			if (asciiVal > 64 && asciiVal < 91)
				capitalAplhabet++;

			if (asciiVal > 96 && asciiVal < 123)
				lowerAplhabet++;

		}

		if (capitalAplhabet == len)
			return true; // all upper case
		if (lowerAplhabet == len)
			return true; // all lower case

		if ((lowerAplhabet == len - 1) && ((int) elements[0] > 64 && (int) elements[0] < 91))
			return true;

		return false;
	}
}
