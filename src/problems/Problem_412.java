package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 412. Fizz Buzz
 * @see https://leetcode.com/problems/fizz-buzz/
 */
public class Problem_412 {
	
	public static void main(String[] args) {

		int n = 15;
		System.out.println(fizzBuzz(n));

	}
	
	public static List<String> fizzBuzz(int n) {
		
		ArrayList<String> list = new ArrayList<>(n);

		for (int iCnt = 1; iCnt <= n; iCnt++) {
			
			if (iCnt % 3 == 0 && iCnt % 5 == 0) list.add("FizzBuzz");//System.out.println("FizzBuzz");
			else if (iCnt % 3 == 0) list.add("Fizz");//System.out.println("Fizz");
			else if (iCnt % 5 == 0) list.add("Buzz");//System.out.println("Buzz");
			else list.add(String.valueOf(iCnt));//System.out.println(iCnt);

		}
		
		return list;

	}

}
