package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 46. Permutations
 * @see https://leetcode.com/problems/permutations/ 
 */

public class Solution_46 {

	public static List<List<Integer>> final_list = new ArrayList<>();

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums) {
		permute(nums, 0, nums.length);
		return final_list;
	}

	public static void permute(int[] nums, int left, int right) {

		// base , terminate condition
		if (left == right) {
			List<Integer> temp = new ArrayList<>();
			for (int num : nums) temp.add(num);
			final_list.add(temp);
			//System.out.println(temp);

		} else {
			for (int iCnt = left; iCnt < right; iCnt++) {
				nums = swap(nums, left, iCnt);
				permute(nums, left + 1, right);
			}
		}

	}

	public static int [] swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
		return nums.clone();
	}

}
