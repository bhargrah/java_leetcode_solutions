package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author rahulbhargava
 * @category 884. Uncommon Words from Two Sentences
 * @see https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */

public class Solution_884 {

	
	public static void main(String[] args) {
		String A = "this apple is sweet", B = "this apple is sour";
		
		//A = "apple apple apple"; B = "banana";
		A = "fd kss fd"; B="fd fd kss";
		
		System.out.println(Arrays.toString(uncommonFromSentences(A,B)));
		
	}
	public static String[] uncommonFromSentences(String A, String B) {
		
		
		Set<String> uncommon = new HashSet<String>();
		Map<String,Integer> bagA = new HashMap<String,Integer>();
		Map<String,Integer> bagB = new HashMap<String,Integer>();

		String uncommonStr = "";
		
		String[] elementsInA= A.split(" ");
		String[] elementsInB= B.split(" ");
		
		System.out.println(Arrays.toString(elementsInA));
		System.out.println(Arrays.toString(elementsInB));
		
		for(String element : elementsInA) {
			if(uncommon.add(element)==false) uncommon.remove(element);
			bagA.put(element,bagA.getOrDefault(element, 0) + 1);
		}
		for(String element : elementsInB) {
			if(uncommon.add(element)==false) uncommon.remove(element);
			bagB.put(element,bagB.getOrDefault(element, 0) + 1);
		}

		System.out.println(uncommon);
		
		for(String key : uncommon) {
			if(bagA.get(key)!=null && bagB.get(key)==null && bagA.get(key) == 1 && bagA.get(key)!=bagB.get(key)) uncommonStr = uncommonStr + " " + key;
			if(bagB.get(key)!=null && bagA.get(key)==null && bagB.get(key) == 1 && bagA.get(key)!=bagB.get(key)) uncommonStr = uncommonStr + " " + key;

		}

		System.out.println(uncommonStr.trim().split(" "));
		
		return uncommonStr.length() !=0 ? uncommonStr.trim().split(" ") : new String[0];

	}

}
