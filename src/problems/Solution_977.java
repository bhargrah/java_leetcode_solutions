package problems;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author rahulbhargava
 * @category 977. Squares of a Sorted Array
 * @see https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Solution_977 {

	public static void main(String[] args) {
		int [] A = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(A));
		sortedSquares(A);
		System.out.println(Arrays.toString(A));
	}

	public static int[] sortedSquares(int[] A) {
		
		for (int iCnt = 0; iCnt < A.length; iCnt++) 
			A[iCnt] = Math.multiplyExact(A[iCnt], A[iCnt]);
		
		Arrays.sort(A); // quick sort implementation
		
		return A;
	}

}
