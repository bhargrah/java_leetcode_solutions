package problems;

/**
 * @author rahulbhargava
 * @category 1323. Maximum 69 Number
 * @see https://leetcode.com/problems/maximum-69-number/
 */

public class Solution_1323 {

	public static void main(String[] args) {
		System.out.println(maximum69Number(9669));
		System.out.println(maximum69Number(9996));
	}

	public static int maximum69Number(int num) {

		char[] elements = String.valueOf(num).toCharArray();
		char[] org = elements.clone();
		
		int max = num;
		int temp = 0;

		for (int i = 0; i < elements.length; i++) {

			char toReplace = (elements[i] == '9') ? '6' : '9';

			elements[i] = toReplace;

			temp = Integer.valueOf(String.valueOf(elements));

			max = temp > max ? temp : max;

			elements = org.clone(); // most important step
		}

		return max;

	}

}
