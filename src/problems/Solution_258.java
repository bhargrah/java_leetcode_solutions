package problems;

/**
 * @author rahulbhargava
 * @category 258. Add Digits
 * @see https://leetcode.com/problems/add-digits/
 */

public class Solution_258 {
	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	public static int addDigits(int num) {
		
		while(num/10 > 0) {
			System.out.println(num);
			num = num/10 + num%10;
		}

		return num; 
	}
}
