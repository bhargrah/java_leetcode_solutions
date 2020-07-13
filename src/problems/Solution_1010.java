package problems;

/**
 * @author rahulbhargava
 * @category 1010. Pairs of Songs With Total Durations Divisible by 60
 * @see https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 */

public class Solution_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] time = { 30, 20, 150, 100, 40 };
		int[]  time1 = { 3, 2, 15, 10, 4 };
		System.out.println(numPairsDivisibleBy60Opti(time));

	}

	public static int numPairsDivisibleBy60(int[] time) {

		int numPair = 0;

		for (int i = 0; i < time.length; i++) {
			
			for (int j = i; j < time.length; j++) {

				if ((time[i] + time[j]) % 60 == 0 && i != j) {
					//System.out.println("time[" + i + "] = " + time[i] + ", time[" + j + "] = " + time[j]+ "): total duration " + (time[i] + time[j]));
					numPair++;
				}

			}
		}

		return numPair;

	}
	
	public static int numPairsDivisibleBy60Opti(int[] time) {

        int[] cnt = new int[60];
        int total = 0;
        for (int num : time) {
        	
            int remainder = num % 60;
            int opposite = (60 - remainder) % 60;
            
            
            total += cnt[opposite];
            System.out.println(num+" : "+remainder+" : "+opposite+" : "+cnt[remainder]+" : "+cnt[opposite]);
            
            cnt[remainder]++;
           //∂ System.out.println(Arrays.toString(cnt));
        }

        return total;
    }

}
