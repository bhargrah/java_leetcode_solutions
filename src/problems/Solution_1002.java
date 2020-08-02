package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 1002. Find Common Characters
 * @see https://leetcode.com/problems/find-common-characters/
 */

public class Solution_1002 {

	public static void main(String[] args) {

		String[] input = { "bella", "label", "roller" };

		System.err.println(commonChars(input));

	}

	public static List<String> commonChars(String[] A) {

		List<String> result = new ArrayList<>();
		String firstElement = A[0];

		for (Character c : firstElement.toCharArray()) {

			boolean exists = true;
			
			for (int i = 1; i < A.length; i++) { // no need to start from first element
				
				if (A[i].indexOf(c + "") == -1) { // convert to string and compare
					exists = false;
					break;
				} else {
					A[i] = A[i].replaceFirst(c + "", "");
				}
				
			}

			if (exists)
				result.add(c + "");

		}

		return result;

	}

}
