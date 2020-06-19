package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 1417. Reformat The String
 * @see https://leetcode.com/problems/reformat-the-string/
 */
public class Solution_1417 {

	public static void main(String[] args) {
		String s = "uzmlfxspduzb2621199741214";
		System.out.println(reformat(s));
	}

	public static String reformat(String s) {

		String result = "";

		List<Character> dict_number = new ArrayList<>();
		List<Character> dict_alphabet = new ArrayList<>();
		
		char [] elements = s.toCharArray();
		
		for(char element:elements) {
			if(96 < element && element < 123) {
				dict_alphabet.add(element);
			} else {
				dict_number.add(element);
			}
		}
		
		System.out.println(dict_alphabet);
		System.out.println(dict_number);

		int alphaSize = dict_alphabet.size();
		int numberSize = dict_number.size();

		
		
		
		if(alphaSize==1 && numberSize==0) return String.valueOf(dict_alphabet.get(0));
		
		if(alphaSize==0 && numberSize==1) return String.valueOf(dict_number.get(0));
		
		if(alphaSize==0 || numberSize==0) return "";
		
		if(Math.abs(alphaSize - numberSize) > 1) return "";
		
		if(alphaSize > numberSize) {
			for(int i=0;i<numberSize;i++) {
				result = result + dict_alphabet.get(i) + dict_number.get(i);
			}
			result = result + dict_alphabet.get(alphaSize-1);
		} else if (numberSize > alphaSize) {
			for(int i=0;i<alphaSize;i++) {
				result = result + dict_number.get(i) + dict_alphabet.get(i);
			}
			result = result + dict_number.get(numberSize-1);
		} else {
			for(int i=0;i<alphaSize;i++) {
				result = result + dict_number.get(i) + dict_alphabet.get(i);
			}
		}

		return result;

	}

}
