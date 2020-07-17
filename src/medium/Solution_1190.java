package medium;

import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 1190. Reverse Substrings Between Each Pair of Parentheses
 * @see https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
 */

public class Solution_1190 {

	public static void main(String[] args) {

		String s = "(abcd)";
		//s = "(u(love)i)";
		//s = "(ed(et(oc))el)";
		reverseParentheses(s);

	}

	public static String reverseParentheses(String s) {

		char[] elements = s.toCharArray();
		StringBuffer buffer = new StringBuffer();
		Stack<Integer> stack = new Stack<>();

		for (int count = 0; count < elements.length; count++) {

			char temp = elements[count];
			
			if (temp == '(') 
				stack.push(count);
			

			if (temp == ')') {
				int start = stack.pop();
				int end = count;
				//System.out.println(start + " : " + end);

				reverse(elements, start, end);
				//System.out.println(Arrays.toString(elements));

			}
		}

		// System.out.println(stack);
		// System.out.println(Arrays.toString(elements));

		for (char element : elements)
			if (element != '#')
				buffer.append(element);

		//System.out.println(buffer.toString());

		return buffer.toString();

	}

	private static void reverse(char[] elements, int start, int end) {

		int len = (end - start);
		elements[start] = '#';
		elements[end] = '#';
		for (int i = 0; i < (len/2)+1; i++) {
			char temp = elements[start + i];
			elements[start + i] = elements[end - i];
			elements[end - i] = temp;
		}

	}

}
