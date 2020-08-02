package problems;

import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 917. Reverse Only Letters
 * @see https://leetcode.com/problems/reverse-only-letters/
 */

public class Solution_917 {

	public static void main(String[] args) {

		String input = "Test1ng-Leet=code-Q!";//"ab-cd";
		System.err.println(reverseOnlyLetters(input));
		
	}

	public static String reverseOnlyLetters(String S) {

		Stack<Character> stack = new Stack<>();
		char [] result = S.toCharArray();
		
		for(char element : result) {
			if( (element > 96 && element < 123) ||  (element > 64 && element < 91) ) {
				stack.push(element);
			}
		}
		
		//System.err.println(stack);
		
		for(int index = 0 ; index < S.length() ; index++) {
			char element = result[index];
			if( (element > 96 && element < 123) ||  (element > 64 && element < 91) ) {
				result[index] = stack.pop();
			}
		}
		
		//System.out.println(String.valueOf(result));
		return String.valueOf(result);
	}

}
