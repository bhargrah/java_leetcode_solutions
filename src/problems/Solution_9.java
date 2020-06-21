package problems;

/**
 * @author rahulbhargava
 * @category 9. Palindrome Number
 * @see https://leetcode.com/problems/palindrome-number/
 */

public class Solution_9 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
		boolean isPalindrome = true;
		
		char [] elements = String.valueOf(x).toCharArray();
		int len = elements.length;
		for(int i = 0 ; i < len/2 ; i++) {
			if(elements[i] != elements[len-1-i]) {
				isPalindrome = false;
				break; // not need to loop if there is one break
			}
		}
		
		return isPalindrome;

	}
}
