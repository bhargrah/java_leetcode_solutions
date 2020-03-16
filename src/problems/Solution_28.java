package problems;

/**
 * @author rahulbhargava
 * @category 28. Implement strStr()
 * @see https://leetcode.com/problems/implement-strstr/
 */

public class Solution_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "lo"));
		System.out.println(strStr("aaa", "aa"));
		System.out.println(strStr("aaa", "aaaa"));
		System.out.println(strStr("mississippi", "sippia"));

	}

	public static int strStr(String haystack, String needle) {

		if (needle.isEmpty() || haystack.equals(needle))
			return 0;

		int haystackLen = haystack.length();
		int needleLen = needle.length();

		if (haystackLen < needleLen)
			return -1;

		char[] haystackChar = haystack.toCharArray();
		char[] needleChar = needle.toCharArray();

		int count = 0;

		for (int iCnt = 0; iCnt < haystackLen - 1; iCnt++) { // iterate over haystack
			for (int jCnt = 0; jCnt < needleLen; jCnt++) { // iterate over needle
				// make sure to check that sum doesn't go over total length of haystack
				if ((iCnt + jCnt) < haystackLen && haystackChar[iCnt + jCnt] == needleChar[jCnt]) {
					count++;
					if (count == needleChar.length) {
						return iCnt;
					}

				} else {
					count = 0;
					break;
				}
			}

		}

		return -1;

	}

}
