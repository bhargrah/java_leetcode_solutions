package medium;

import java.util.PriorityQueue;

/**
 * @author rahulbhargava
 * @category 973. K Closest Points to Origin
 * @see https://leetcode.com/problems/k-closest-points-to-origin/
 */

class Point {
	int x = 0;
	int y = 0;
	double distance = 0;

	Point(int[] coordinates) {
		x = coordinates[0];
		y = coordinates[1];
		distance = Math.sqrt(x * x + y * y);
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Solution_973 {

	public static void main(String[] args) {

		// int [][] points = {{1,3},{-2,2}};
		// int K = 1;

		int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int K = 2;
		kClosest(points, K);

	}

	public static int[][] kClosest(int[][] points, int K) {

		int[][] result = new int[K][2];

		PriorityQueue<Point> queue = new PriorityQueue<>(K, (p1, p2) -> Double.compare(p2.distance, p1.distance));

		for (int i = 0; i < points.length; i++) {

			Point newPoint = new Point(points[i]);

			if (i < K) {
				queue.add(newPoint);
			} else {
				if (queue.peek().distance > newPoint.distance) {
					queue.poll();
					queue.add(newPoint);
				}
			}
		}

		System.err.println(queue);
		int len = queue.size();
		for (int i = 0; i < len; i++) {
			Point point = queue.poll();
			result[i][0] = point.x;
			result[i][1] = point.y;
		}
		// System.out.println(Arrays.toString(result));

		return result;
	}

}
