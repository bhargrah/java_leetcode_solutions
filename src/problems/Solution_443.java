package problems;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 443. String Compression
 * @see https://leetcode.com/problems/string-compression/
 */

public class Solution_443 {

	public static void main(String[] args) {

		char[] chars = { 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
		System.out.println(compress(chars));

	}

	public static int compress(char[] chars) {

		int iPointer = 0;
		int jPointer = 0;
		int count = 0;
		int index = 0;
		int len = chars.length;

		while (iPointer < len) {

			jPointer = iPointer;

			while (jPointer < len && chars[iPointer] == chars[jPointer]) {
				jPointer++;
			}

			count = jPointer - iPointer;

			chars[index++]= chars[iPointer];
			
			if (count > 1) 
				for (char ele : (count + "").toCharArray())
					chars[index++] = ele;
			

			iPointer = jPointer;

		}

		System.out.println(Arrays.toString(chars));

		return index;

	}

}
