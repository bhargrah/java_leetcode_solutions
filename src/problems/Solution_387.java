package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 387. First Unique Character in a String
 * @see https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class Solution_387 {

	public static void main(String[] args) {

		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));

	}

	public static int firstUniqChar(String s) {

		char[] sampleInput = s.toCharArray();
		Map<String, Integer> wallet = new HashMap<>();

		for (char sample : sampleInput) {

			String key = String.valueOf(sample);

			if (wallet.get(key) == null)
				wallet.put(key, 1);
			else
				wallet.put(key, wallet.get(key) + 1);

		}

		for (int iCnt = 0; iCnt < sampleInput.length; iCnt++) {

			String key = String.valueOf(sampleInput[iCnt]);
			if (wallet.get(key) == 1)
				return iCnt; // return first index which is non repeating

		}

		return -1;

	}

}
