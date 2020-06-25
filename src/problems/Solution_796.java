package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 796. Rotate String
 * @see https://leetcode.com/problems/rotate-string/
 */

public class Solution_796 {

	public static void main(String[] args) {
		String A = "abcde", B = "cdeab";
		System.out.println(rotateString(A, B));
	}

	public static boolean rotateString(String A, String B) {

		if(A.equals(B)) return true; // defensive coding
		
		boolean isEqual = false;	
		
		char[] a = A.toCharArray();		

		// Start shifting elements
		System.out.println(Arrays.toString(a));

		for (int i = 1; i < a.length; i++) {
			rotate(a, 1); // shift A by one for each step loop
			if (String.valueOf(a).equals(B)) {
				isEqual = true;
				break;
			}
		}

		return isEqual;

	}

	public static void rotate(char[] arr, int num) {

		int len = arr.length;
		int mod = num % len;

		reverse(arr, 0, mod - 1);
		reverse(arr, mod, len - 1);
		reverse(arr, 0, len - 1);
	}

	public static void reverse(char[] arr, int start, int end) {

		if (arr == null || arr.length == 1)
			return;

		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
