package problems;

/**
 * @author rahulbhargava
 * @category 476. Number Complement
 * @see https://leetcode.com/problems/number-complement/
 */

public class Solution_476 {

	public static void main(String[] args) {

		System.out.println(findComplement(5));

	}

	public static int findComplement(int num) {
		int complement = 0;
		String binary = "";
		String complementry = "";

		while (num > 0) {
			int val = num % 2;
			binary = val + binary;
			val = (val == 0) ? 1 : 0;
			complementry = val + complementry;
			num = num / 2;
		}

//		System.out.println(binary);
//		System.out.println(complementry);
		char[] elements = complementry.toCharArray();
//		System.out.println(Arrays.toString(elements));
		int len = elements.length;
		for (int iCnt = 0; iCnt < len; iCnt++) {
			int ele = Integer.parseInt(String.valueOf(elements[len - 1 - iCnt]));
			complement = complement + ele * (int) Math.pow(2, iCnt);
		}

		return complement;
	}

}
