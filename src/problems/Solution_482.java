package problems;

/**
 * @author rahulbhargava
 * @category 482. License Key Formatting
 * @see https://leetcode.com/problems/license-key-formatting/
 */	


public class Solution_482 {

	public static void main(String[] args) {

		Solution_482 sol = new Solution_482();

		System.out.println(sol.licenseKeyFormatting("5F3Z-2e-9-w", 4));
		System.out.println(sol.licenseKeyFormatting("2-5g-3-J", 2));

		System.out.println(sol.licenseKeyFormatting("a0001afds-", 4));

		System.out.println(sol.licenseKeyFormatting("2-", 2));

	}

	public String licenseKeyFormatting(String s, int k) {

		s = s.toUpperCase().replace("-", "");

		if (k > s.length())
			return s;

		StringBuilder buffer = new StringBuilder();

		int mod = s.length() % k;

		String sub = s.substring(0, mod);

		char[] ch = s.toCharArray();

		int count = 0;

		for (int index = mod; index < ch.length; index++) {

			if (count % k == 0 && count != 0) {
				buffer.append('-');
				count = 0;
			}

			buffer.append(ch[index]);
			count = count + 1;
		}

		return mod > 0 ? sub + "-" + buffer.toString() : buffer.toString();

	}

}
