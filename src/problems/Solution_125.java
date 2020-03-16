package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 125. Valid Palindrome
 * @see https://leetcode.com/problems/valid-palindrome/
 */

public class Solution_125 {
	public static void main(String[] args) {

		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("0P"));
		
	}

	public static boolean isPalindrome(String s) {

		boolean isPalindrome = true;
		
		if(s.equals(" ")) return isPalindrome; // empty string is valid palindrome

		
		List<Character> list = new ArrayList<>();
		for(char item : s.toLowerCase().toCharArray()) {
			if((item > 96 && item < 123) || item > 47 && item < 58) list.add(item);
		}
		
		Object[] stream = list.toArray();
		int len = stream.length;
		for (int iCnt = 0; iCnt < len / 2; iCnt++) {
			if (stream[iCnt] != stream[len - 1 - iCnt]) {
				isPalindrome = false;
				break;
			}

		}

		return isPalindrome;

	}

}
