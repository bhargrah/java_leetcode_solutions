package problems;

import java.util.function.Consumer;

/**
 * @author rahulbhargava
 * @category 11. Container With Most Water
 * @see https://leetcode.com/problems/container-with-most-water/
 */

public class Solution_11 {

	public static final Consumer<Integer> print = s -> System.out.println(s); // consumer , java 8
	
	public static void main(String[] args) {

		//int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		
		int[] height = {2,2};
		
		print.accept(maxArea(height));

	}

	public static int maxArea(int[] height) {
		
		int maxArea = 0;
		int startIndex = 0;
		int endIndex = height.length-1;

		maxArea = findArea(height, startIndex, endIndex); // calculate the initial area
		
		// aim is to find max Area
		while(startIndex < endIndex) {
			
			if(height[startIndex] < height[endIndex]) startIndex++;
			else endIndex --;
			
			int area = findArea(height, startIndex, endIndex);
			
			if(area > maxArea) // check and reset then maximum value
				maxArea = area;			
			
		}
		
		return maxArea;

	}

	private static int findArea(int[] height, int startIndex, int endIndex) {

		int breadth = endIndex - startIndex;
		int high = Math.min(height[startIndex], height[endIndex]);
		return breadth * high;
	}

}
