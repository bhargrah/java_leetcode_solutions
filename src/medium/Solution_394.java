package medium;

import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 394. Decode String
 * @see https://leetcode.com/problems/decode-string/
 */

public class Solution_394 {

	public static void main(String[] args) {
		System.err.println("Final : " + decodeString("2[abc]3[cd]ef"));
	}

	public static String decodeString(String s) { // "2[abc]3[cd]ef"

		StringBuilder currenString = new StringBuilder();
		Stack<StringBuilder> literal =  new Stack<>();
		Stack<Integer> multiplier = new Stack<>();
		int number = 0 ;
		
		for(char item : s.toCharArray()) {
			
			if(Character.isDigit(item)) {
				
				number = number * 10 + item - '0'; // make sure to append the digit ,like if we get 100[er]
				
			} else if(item == '[') {
				
				multiplier.push(number);
				literal.push(currenString);
				currenString = new StringBuilder();
				number = 0;
				
			} else if(item == ']') {
				
				StringBuilder decodeString = literal.pop();
				for(int count = multiplier.pop() ; count >0 ; count--)
					decodeString.append(currenString);
				
				currenString = decodeString;
				
			} else {
				currenString.append(item);
			}
			
		}
		
		return currenString.toString();
	}

}
