package problems;

public class Solution_204 {

	public static void main(String[] args) {
		System.out.println(countPrimes(2));
		System.out.println(countPrimes(499979));

	}

	public static int countPrimes(int n) {

		boolean flag = false;
		int count = 0;
		for (int iCnt = 2; iCnt <= n - 1; iCnt++) {
			flag = false;

			for (int jCnt = 2; jCnt * jCnt <= iCnt; jCnt++) { // optimization hack , limit internal loop
				if (iCnt % jCnt == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) count++;
		}

		return count;
	}

}
