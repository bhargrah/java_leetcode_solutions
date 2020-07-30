package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution_49 {

	public static List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> dict = new HashMap<>();
		
		List<List<String>> result = new ArrayList<List<String>>();

		for (String value : strs) {

			char[] litrals = value.toCharArray();
			Arrays.sort(litrals);
			String key = String.valueOf(litrals);

			List<String> list = dict.getOrDefault(key, new ArrayList<String>());
			list.add(value);
			
			dict.put(key, list);			

		}
		
		System.err.println(dict.values());
		
		for(String key : dict.keySet())  result.add(dict.get(key));
		

		return result;
	}

	public static void main(String[] args) {

		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(input));

	}

}
