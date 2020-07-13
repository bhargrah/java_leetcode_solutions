package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 189. Rotate Array
 * @see https://leetcode.com/problems/rotate-array/
 */

public class Solution_189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		//rotate(nums,k);
		
		//nums = {1,2,3};
		//k = 4;
		
		System.out.println(Arrays.toString(nums));
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));

		
		//rotate(nums, k);
	}
	
	public static void rotate(int[] nums, int k) {
		
		//skip if there is no rotation
		if(k==0) return;
		
		int len = nums.length;
		
		// no need to rotate  for zero and length zero
		if(len==0 || len==1) return;
		
		// optimization when you are rotating array more than the length
		if(k>len) 
			k = k - len;
		
		int [] nums_final = new int [len];
		
		// make sure to clone it
		nums_final = nums.clone();
		
		// right rotation scenario
		if (k > 0) { 

			for (int iCnt = 0; iCnt < k; iCnt++)
				nums[iCnt] = nums_final[len - k + iCnt];
		// left rotation scenario
		} else { 
            k = k * (-1);
			for (int iCnt = k - 1; iCnt >= 0; iCnt--)
				nums[iCnt] = nums_final[len - k + iCnt];

		}
		
		//copy remaining elements
		System.arraycopy(nums_final, 0, nums, k, len-k);
		
		//memory optimization
		nums_final = null;

	}
	

}
