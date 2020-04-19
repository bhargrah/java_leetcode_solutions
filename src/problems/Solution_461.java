package problems;

/**
 * @author rahulbhargava
 * @category 461. Hamming Distance
 * @see https://leetcode.com/problems/hamming-distance/
 */

public class Solution_461 {

	public static void main(String[] args) {
		System.out.println(hammingDistance(1,4));
	}

	public static int hammingDistance(int x, int y) {
		int hummingDistance = 0;

		int x_bit = 0;
		int y_bit = 0;
		
		while (x > 0 || y > 0) {
			x_bit = ((x % 2 == 0) ? 0 : 1);
			x = x / 2;
		
			y_bit = ((y % 2 == 0) ? 0 : 1);
			y = y / 2;
			
			if(x_bit - y_bit != 0) hummingDistance++;
		}

		//System.out.println(Integer.toBinaryString(1));
		//System.out.println(Integer.toBinaryString(4));

		return hummingDistance;
	}

}
