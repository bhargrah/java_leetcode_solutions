package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rahulbhargava
 * @category 169. Majority Element  
 * @see https://leetcode.com/problems/majority-element/
 */
public class Problem_169 {

	public static void main(String[] args) {

		int [] input = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(input));
		
	}

	public static int majorityElement(int[] nums) {

		int length = nums.length;
		Map<Integer,Integer> dict = new HashMap<>();
		
		for(int iCnt = 0 ; iCnt < length ; iCnt ++) {
			int key = nums[iCnt];
				if(dict.get(key)==null)
					dict.put(key, 1);
				else 
					dict.put(key, dict.get(key)+1);
		}
		
		System.out.println(dict);
		
		return dict.entrySet().stream() // create stream
        .max(Comparator.comparing(Map.Entry::getValue)) // get max value
        .get().getKey(); // get key corresponding to max value returned 
		
	}

}
