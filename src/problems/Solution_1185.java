package problems;

import java.time.LocalDate;

/**
 * @author rahulbhargava
 * @category 1185. Day of the Week
 * @see https://leetcode.com/problems/day-of-the-week/
 */

public class Solution_1185 {
	
	public static void main(String[] args) {
	   	int day = 31, month = 8, year = 2019;
	   	System.out.println(dayOfTheWeek(day,month,year));
	}
	
	 public static String dayOfTheWeek(int day, int month, int year) {		 
		 
		 LocalDate date = LocalDate.of(year,month,day);		 
		 String dayOfWeek = date.getDayOfWeek().toString();		 
		 dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1).toLowerCase();
		 
		 return dayOfWeek;
	        
	    }
}
