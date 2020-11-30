package problems;

/**
 * @author rahulbhargava
 * @category 1394. Find Lucky Integer in an Array
 * @see hhttps://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/
 */	

import java.util.HashMap;
import java.util.Map;

public class Solution_1394 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 3, 3, 3 };
		System.out.println(findLucky(input));

	}

	public static int findLucky(int[] arr) {

		Map<Integer, Integer> frequency_dict = new HashMap<>(arr.length);
		for (Integer key : arr) {
			frequency_dict.put(key, frequency_dict.getOrDefault(key, 0) + 1);
		}

		int luckyNumber = -1;

		for (Integer key : frequency_dict.keySet()) {
			if (key == frequency_dict.get(key)) {
				if (luckyNumber < key)
					luckyNumber = key;
			}

		}

		return luckyNumber;
	}

}
