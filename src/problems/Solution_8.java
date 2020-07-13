package problems;

public class Solution_8 {

	public static void main(String[] args) {

		System.out.println(myAtoi(" "));
		
		//System.out.println(myAtoi("   -42"));

		//System.out.println(myAtoi("4193 with words"));

		//System.out.println(myAtoi("words and 987"));

		
		
		
	}

	public static int myAtoi(String str) {

		if(str.length()==0)
			return 0;
		
		
		char [] element = str.toCharArray();
		for(char ele : element) {
			int val = (int) ele;
			
			if(val > 47 && val < 58)
			  System.err.println(val);
		}
		
		
		
		return 0;
		
	}

}
