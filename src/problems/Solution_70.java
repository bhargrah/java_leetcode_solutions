package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 70. Climbing Stairs
 * @see https://leetcode.com/problems/climbing-stairs/
 */

public class Solution_70 {

	public static int number_of_steps = 0 ;
	
	public static void main(String[] args) {

		System.out.println(climbStairs(4));
		System.out.println(climb_Stairs_dp(4));
		
	}

	// Solution 1 : Recursion 
	public static int climbStairs(int n) {
		number_of_steps = n;
		return climb_Stairs(0);
	}

	public static int climb_Stairs(int i) {
		
		if (i > number_of_steps) return 0; // break condition , terminate recursion
		
		if (i == number_of_steps) return 1;
		
		return climb_Stairs(i + 1) + climb_Stairs(i + 2);
	}
	
	// Solution 1 : Dynamic Programming
	public static int climb_Stairs_dp(int n) {

		
		if (n == 1)
			return 1;

		int[] dp = new int[n + 1];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(Arrays.toString(dp));
		
		return dp[n];

	}

}
