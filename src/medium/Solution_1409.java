package medium;

import java.util.Arrays;

/**
 * @author rahulbhargava
 * @category 1409. Queries on a Permutation With Key
 * @see https://leetcode.com/problems/queries-on-a-permutation-with-key/
 */

public class Solution_1409 {

	public static void main(String[] args) {

		int [] queries = {3,1,2,1};
		int m = 5;
		
		processQueries(queries,m);
		
	}

	public static int[] processQueries(int[] queries, int m) {
		
		int len = queries.length;
		int [] result = new int[len];
		int [] permuation = new int[m];
		
		for(int i = 0 ; i < m ; i++)
			permuation[i] = i+1;
		
		
		for(int i = 0 ; i < len ; i++) {
			int element = queries[i];
			for(int j = 0 ; j < m ; j++) {
				if(element==permuation[j]) {
					result[i] = j;
					permuation = swapWithFirstIndex(permuation,j);
					System.out.println(j+" : "+Arrays.toString(permuation));
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));

		
		return result;

	}

	private static int[] swapWithFirstIndex(int [] permuation,int j) {

		int [] finalre = new int[permuation.length];
		int temp = permuation[j];
		int x  = 0;
		finalre[x]=temp;
		
		for(int i=0;i < permuation.length ; i++) 
			if(temp!= permuation[i]) 
				finalre[++x] = permuation[i];
					
		
		return finalre;
		
	}

}
