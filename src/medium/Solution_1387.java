package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahulbhargava
 * @category 1387. Sort Integers by The Power Value
 * @see https://leetcode.com/problems/sort-integers-by-the-power-value/
 */
class PowerValue {

	int number;
	int power;

	public PowerValue(int number, int power) {
		this.number = number;
		this.power = power;
	}

	@Override
	public String toString() {
		return "[" + number + "," + power + "]";
	}

}

public class Solution_1387 {

	public static void main(String[] args) {
		// int lo = 12, hi = 15, k = 2;
		int lo = 7, hi = 11, k = 4;
		getKth(lo, hi, k);
	}

	public static int getKth(int lo, int hi, int k) {

		List<PowerValue> list = new ArrayList<>();

		int len = hi - lo;
		for (int i = 0; i <= len; i++) {
			int key = lo + i;
			int powerValue = getPowerValue(key);
			list.add(new PowerValue(key, powerValue));
			System.out.println("The power of " + key + " is " + powerValue);
		}

		System.out.println(list);
		list.sort((p1, p2) -> Integer.compare(p1.power, p2.power));

		System.out.println(list);
		System.out.println(list.get(k - 1).number);

		return list.get(k - 1).number;
	}

	private static int getPowerValue(int value) {

		int powerVal = 0;

		while (true) {
			powerVal++;

			// can optimize the logic by adding interim value to HashMap and avoid
			// unnessary loops

			if (value % 2 == 0)
				value = value / 2;
			else
				value = 3 * value + 1;

			if (value == 1)
				break;
		}

		return powerVal;
	}

}
