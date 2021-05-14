package medium;

/**
 * @author rahulbhargava
 * @category 695. Max Area of Island
 * @see https://leetcode.com/problems/max-area-of-island/
 */

public class Solution_695 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
	}

	public int maxAreaOfIsland(int[][] grid) {

		int max = 0;

		for (int i = 0; i < grid.length; i++) 
			for (int j = 0; j < grid[i].length; j++) 
				if (grid[i][j] == 1) 
					max = Math.max(max, dfs(grid, i, j));
				
		return max;
	}

	private int dfs(int[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || 
				j < 0 || j >= grid[i].length 
				  || grid[i][j] == 0)
			return 0;

		grid[i][j] = 0;

		int count = 1;
		count += dfs(grid, i + 1, j); // down
		count += dfs(grid, i - 1, j); // up
		count += dfs(grid, i, j + 1); // left
		count += dfs(grid, i, j - 1); // right

		return count;
	}

}
