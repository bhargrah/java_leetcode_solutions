package problems;

/**
 * @author rahulbhargava
 * @category 771. Jewels and Stones
 * @see https://leetcode.com/problems/jewels-and-stones/
 */
public class Solution_771 {

	public static void main(String[] args) {
		String J = "c", S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}

	public static int numJewelsInStones(String J, String S) {
		int numOfJewels = 0;

		for (char stone : S.toCharArray()) {
			for (char jewel : J.toCharArray()) {
				if (stone == jewel) {
					numOfJewels++;
				}
			}
		}

		return numOfJewels;
	}

}
