package problems;

import java.math.BigDecimal;

/**
 * @author rahulbhargava
 * @category 172. Factorial Trailing Zeroes
 * @see https://leetcode.com/problems/factorial-trailing-zeroes/
 */

public class Solution_172 {

	public static void main(String[] args) {
		
		System.out.println(trailingZeroes(30));
		System.out.println(trailingZeroes_big_decimal(30));

	}

	/* Explanation - https://leetcode.com/problems/factorial-trailing-zeroes/discuss/522315/Clear-explanation-of-the-solution-since-I-didn't-find-an-adequate-one */
	
	private static int trailingZeroes(int n) {

		if(n<5) return 0;
		
        int zeroCount = 0;
        
        while(n > 0){
            n = n/5 ;
            zeroCount = zeroCount + n;
        }
        return zeroCount;
        
	}
	
	public static int trailingZeroes_big_decimal(int n) {   // timing out due to large calculation

		int zeroCount = 0;
		BigDecimal finalFactor = new BigDecimal(1);

		for (int iCnt = 0; iCnt < n; iCnt++) // using BigDecimal to handle large values 
			finalFactor = finalFactor.multiply(new BigDecimal(n - iCnt)); 

		System.out.println(finalFactor);
		
		char[] elements = finalFactor.toString().toCharArray();
		int len = elements.length;

		for (int iCnt = len - 1; iCnt > 1; iCnt--) {
			if (elements[iCnt] == 48)
				zeroCount++; // incrementing the zero count by comparing asci values
			else
				break; // breaking the loop if there are no zeros
		}

		return zeroCount;

	}

}
