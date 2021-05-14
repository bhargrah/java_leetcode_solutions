package medium;

/**
 * @author rahulbhargava
 * @category 200. Number of Islands
 * @see https://leetcode.com/problems/number-of-islands/
 */

public class Solution_200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numIslands(char[][] grid) {

		if (grid == null || grid.length == 0)
			return 0;

		int numOfIsland = 0;

		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				if (grid[i][j] == '1')
					numOfIsland += dfs(grid, i, j);

		return numOfIsland;
	}

	private int dfs(char[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || // check x-axis bounds
			j < 0 || j >= grid[i].length ||  // check y-axis bounds
			grid[i][j] == '0') // check if node already visited
			return 0;

		grid[i][j] = '0';
		dfs(grid, i - 1, j); // down
		dfs(grid, i + 1, j); // up
		dfs(grid, i, j - 1); // left
		dfs(grid, i, j + 1); // right

		return 1;
	}

}
