package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 22. Generate Parentheses
 * @see https://leetcode.com/problems/generate-parentheses/
 */

public class Solution_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_22 test = new Solution_22();
		System.out.println(test.generateParenthesis(5));

	}

	public Set<String> dict = new HashSet<>();

	public  List<String> generateParenthesis(int n) {

		String sample = "";
		for (int i = 0; i < n; i++) sample = sample + "()";
		
		char [] elemnts = sample.toCharArray();

		//System.out.println(sample);

		permute(elemnts, 0, elemnts.length);
		
		List<String> finalList = new ArrayList<String>();	
		dict.stream().forEach(entry -> finalList.add(entry.trim()));
		
		return finalList;
	}

	private void permute(char [] sample, int start, int end) {

		if (start == end) {
			validateParanthesis(sample);
		} else {

			for (int i = start; i < end; i++) {
				char [] temp = swap(sample, start, i);
				permute(temp, start + 1, end);
			}
		}

	}

	private void validateParanthesis(char [] element) {

		Stack<Character> stack = new Stack<>();

		for (char ele : element) {
			if (ele == '(')
				stack.push(ele);
			else if (ele == ')' && !stack.isEmpty())
				stack.pop();
		}

		boolean flag = stack.size() == 0 ? true : false;

		if (flag)
			dict.add(String.valueOf(element));

	}

	private char [] swap(char [] element, int start, int i) {

		char swap = element[start];
		element[start] = element[i];
		element[i] = swap;

		return element.clone();
	}

}
