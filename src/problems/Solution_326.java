package problems;

/**
 * @author rahulbhargava
 * @category 326. Power of Three
 * @see https://leetcode.com/problems/power-of-three/
 */

public class Solution_326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(1));
		System.out.println(isPowerOfThree(8));
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfThree(27));
		System.out.println(isPowerOfThree(45));
	}

	public static boolean isPowerOfThree(int n) {

		if (n <= 0)
			return false;

		int number = n;
		int multi_factor = 1;

		while (number > 1) {
			number /= 3; // keep dividing the number by 3
			multi_factor *= 3; // keep multiplying the number to calculate multiple number
		}

		return n % multi_factor == 0; // need to check if the number is same as multiple factor
	}

}
