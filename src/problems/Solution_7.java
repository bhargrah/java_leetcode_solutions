package problems;

/**
 * @author rahulbhargava
 * @category 7. Reverse Integer
 * @see https://leetcode.com/problems/reverse-integer/
 */

public class Solution_7 {

	public static void main(String[] args) {
		System.out.println(reverse(123450));
		System.out.println(reverse(-123));
	}

	public static int reverse(int x) {

		String finalStr = "";

		int sign = x < 0 ? -1 : 1;
		int num = x * sign;
		while (num != 0) {
			finalStr = finalStr + num % 10;
			num = num / 10;
		}

		try {x = Integer.parseInt(finalStr) * sign;} 
		catch (Exception e) {x = 0;}
		return x;

	}

}
