package problems;

/**
 * @author rahulbhargava
 * @category 1281. Subtract the Product and Sum of Digits of an Integer
 * @see https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

public class Solution_1281 {

	public static void main(String[] args) {

		System.out.println(subtractProductAndSum(4));
	}

	public static int subtractProductAndSum(int n) {

		if(n<10)
			return 0;
		
		int sum = 0;
		int prodcut = 1;
		while (n != 0) {

			int temp = n % 10;
			sum = sum + temp;
			prodcut = prodcut * temp;
			n = n / 10;

		}

		return prodcut - sum;
	}

}
