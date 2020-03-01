package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 347. Top K Frequent Elements
 * @see https://leetcode.com/problems/top-k-frequent-elements/
 */

public class Problem_347 {

    class Elements {

		int key;
		int values;
		public int getKey() { return key; }
		public Elements(int key,int values) { this.key=key; this.values=values;}
		
	}
	
	public static void main(String[] args) {

		Problem_347 invoker = new Problem_347();
		
		// sample input 
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		
		System.out.println(invoker.topKFrequent(nums, k));
		
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		
		Map<Integer,Integer> dict = new HashMap<>();
		List<Integer> list = new ArrayList<>(k);
		List<Elements> elements = new ArrayList<>();
		
		for(int element : nums) {
			if(dict.get(element)==null) // element not present , add it to dict
				dict.put(element, 1);
			else 
				dict.put(element,dict.get(element)+1); // tracking frequency of elements
		}
		
		// Populate list for the entries 
		Iterator<Integer> iterator = dict.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			elements.add(new Elements(key, dict.get(key)));
		}
		
		// Sorting the list in descending order 
		Collections.sort(elements,new Comparator<Elements>() {
			@Override
			public int compare(Elements o1, Elements o2) {
				return  o2.values-o1.values;
			}
		});
		
		for(int jCnt = 0 ; jCnt < k ; jCnt++) 
			list.add(elements.get(jCnt).getKey());
		
		return list;

	}

}
