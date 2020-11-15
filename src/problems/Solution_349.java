package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author rahulbhargava
 * @category 349. Intersection of Two Arrays
 * @see https://leetcode.com/problems/intersection-of-two-arrays/submissions/
 */

public class Solution_349 {

	public static void main(String[] args) {

		int[] nums1 = { 4, 7, 9, 7, 6, 7 };
		int[] nums2 = { 5, 0, 0, 6, 1, 6, 2, 2, 4 };

		intersection(nums1, nums2);

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		List<Integer> result = new ArrayList<>();

		// defensive coding , edge cases
		if (nums1.length == 0 || nums2.length == 0)
			return result.stream().mapToInt(i -> i).toArray();

		Set<Integer> set1 = new HashSet<>();
		for (Integer element : nums1)
			set1.add(element);

		Set<Integer> set2 = new HashSet<>();
		for (Integer element : nums2)
			set2.add(element);

		set1.stream().forEach(s -> {
			if (set2.contains(s)) {
				result.add(s);
			}
		});

		System.out.println(result);

		return result.stream().mapToInt(i -> i).toArray();

	}

}
