package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 217. Letter Combinations of a Phone Number
 * @see https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

public class Solution_17 {

	public static void main(String[] args) {

		System.out.println(letterCombinations("223"));
		System.out.println(letterCombinations("23"));
		System.out.println(letterCombinations(""));

	}

	public static List<String> letterCombinations(String digits) {

		List<String> finalResult = new ArrayList<String>(0);
		
		if(digits.isEmpty()) return finalResult; // handle empty values
		
		Map<Character, String> dict = new HashMap<>(8);
		dict.put('2', "abc");dict.put('3', "def");dict.put('4', "ghi");dict.put('5', "jkl");
		dict.put('6', "mno");dict.put('7', "pqrs");dict.put('8', "tuv");dict.put('9', "wxyz");

		finalResult.add("");

		char[] numbers = digits.toCharArray();
		int len = numbers.length;

		for (int iCnt = len - 1; iCnt > -1; iCnt--) {
			char[] temp = dict.get(numbers[iCnt]).toCharArray();
			finalResult = combination(temp, finalResult);
		}

		return finalResult;

	}

	private static List<String> combination(char[] temp, List<String> finalResult) {

		List<String> result = new ArrayList<>();

		for (int iCnt = 0; iCnt < temp.length; iCnt++) {
			for (int jCnt = 0; jCnt < finalResult.size(); jCnt++) {
				result.add(String.valueOf(temp[iCnt]) + finalResult.get(jCnt));
			}
		}

		return result;
	}

}
