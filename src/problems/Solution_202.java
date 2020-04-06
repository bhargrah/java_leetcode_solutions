package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rahulbhargava
 * @category 202. Happy Number
 * @see https://leetcode.com/problems/happy-number/
 */

public class Solution_202 {

	public static void main(String[] args) {

		System.out.println("isHappy(67) -> "+isHappy(67));
		System.out.println("isHappy(19) -> "+isHappy(19));

	}

	public static int breakAndSum(int n) {

		int local_sum = 0;
		
		while(n!=0) {
			local_sum += (n % 10) * ( n % 10);
			n = n/10;
		}
		
		return local_sum;
	}

	public static boolean isHappy(int n) {

		if (n < 0)
			return false;

		Set<Integer> seen = new HashSet<>();

		int sum = n; // assign the value

		while (sum != 1) {

			sum = breakAndSum(sum);

			// if number is already present then number
			// is not happy and we will break the loop
			if (!seen.add(sum))
				return false; // number not happy 

		}
	
		return true; // number is happy
	}

}
