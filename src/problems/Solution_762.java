package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rahulbhargava
 * @category 762. Prime Number of Set Bits in Binary Representation
 * @see https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */

public class Solution_762 {

	public static void main(String[] args) {
				
		int L = 244, R = 269;
		System.out.println(countPrimeSetBits(L, R));
	}

	public static Set<Integer> prime_dict = new HashSet<>();

	
	public static int countPrimeSetBits(int L, int R) {
		int primeSetBits = 0;


		for (int i = L; i < R + 1; i++) {

			System.out.println(i + " : " +Integer.bitCount(i));
			int element = Integer.bitCount(i);
			boolean isPrime = isPrimeNumber(element);
			if (isPrime) {
				prime_dict.add(element);
				primeSetBits++;
			}
		}

		return primeSetBits;

	}

	public static boolean isPrimeNumber(int number) {
		
		//optimization , do not loop through below logic if number is present in dict
		if(prime_dict.contains(number)) return true;
		
		//System.out.println("looping");
		if (number == 2 || number == 3) {
			return true;
		}
		if (number == 1 || number % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
