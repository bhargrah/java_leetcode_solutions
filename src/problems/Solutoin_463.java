package problems;

/**
 * @author rahulbhargava
 * @category 463. Island Perimeter
 * @see https://leetcode.com/problems/island-perimeter/
 */

public class Solutoin_463 {

	public static final int LAND = 1;
	public static final int WATER = 0;
	public static final int VISITED = -1;

	public int islandPerimeter(int[][] grid) {

		int perimiter = 0;

		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				if (grid[i][j] == 1)
					perimiter += dfs(grid, i, j);

		return perimiter;

	}

	private int dfs(int[][] grid, int i, int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length)
			return 1;

		if (grid[i][j] == LAND)
			return 0;
		
		if (grid[i][j] == WATER)
			return 1;

		grid[i][j] = VISITED;

		return dfs(grid, i - 1, j) + 
				dfs(grid, i + 1, j) + 
				 dfs(grid, i, j + 1) + 
				  dfs(grid, i, j - 1);
	}

}
