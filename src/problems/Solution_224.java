package problems;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author rahulbhargava
 * @category 224. Basic Calculator
 * @see https://leetcode.com/problems/basic-calculator/
 */

public class Solution_224 {

	public static void main(String[] args) {
     //System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
      //calculate(" 2-1 + 2 ");
      //System.out.println(calculate("2-(5-6)"));
      
      System.out.println(calculate("(5-(1+(5)))"));
	}
	
	
	public static int calculate(String s) {
		
		//safety net
		if(s.isEmpty())
			return 0;
		
		// get rid of blank spaces
		s = s.replace(" ", "");
		
		// define constants
		char [] stream = s.toCharArray();
		int len = s.length();
		int result = 0 ;
		
		
		Stack<Character> stack =  new Stack<>();
 		
		for(int iCnt=0 ; iCnt < len ; iCnt++) {
			
			if(stream[iCnt]!=')') {
			  stack.push(stream[iCnt]); // keep pushing values until we have close bracket
			} else {
				String expression="";
				while(true) {
					char element = stack.pop(); // keep popping until we hit opening bracket
					if(element=='(') { 
						
						char [] number = String.valueOf(simpleExpressionEval(expression)).toCharArray(); // calculate value of expression
						
						for(int jCnt = 0 ; jCnt < number.length ;jCnt++)
							stack.push(number[jCnt]); // 33 will be entered like 3,3
						
						break; // break while loop 
					
					} else {
						expression = element + expression; // keep appending string for expression
					}
				}
			}
		}
		
		// check if the stack size to get more values
		if (stack.size() > 0) {
			String expression = "";
			Iterator<Character> iter = stack.iterator();
			while(iter.hasNext()) expression += iter.next();
			result = simpleExpressionEval(expression);
		}
		
		return result;
	}

	public static int simpleExpressionEval(String s) {
		System.out.println(s);
		
		// mathematical hacks
		s = s.replace("--", "+");
		s = s.replace("+-", "-");
		s = s.charAt(0)=='-' ? '0'+s : s;
		
		System.out.println(s);
		int result = 0;
		char operator = '+'; 
		
		int len = s.length();
		
		
		for(int iCnt=0 ; iCnt < len ; iCnt++) {
			
			int start = iCnt;
			
			while(iCnt < len && Character.isDigit(s.charAt(iCnt)))
				iCnt++;
			
			
			int num = Integer.parseInt(s.substring(start,iCnt));
			
			switch(operator) {
			
				case '+' :
					result = result + num;
					break;
				case '-' :
					result = result - num;
					break;
			
			}
			
			if(iCnt!=len)
				operator = s.charAt(iCnt);
			
		}
		
		
		System.out.println(s+" = "+result);
		return result;
		
	}

}

