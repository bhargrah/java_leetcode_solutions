package problems;

/**
 * @author rahulbhargava
 * @category 227. Basic Calculator II
 * @see https://leetcode.com/problems/basic-calculator-ii/
 */

public class Solution_227 {

	public static void main(String[] args) {

		calculate(" 33-5 / 2 ");
		
	}

	public static int calculate(String s) {
		
		// replace the empty strings  //  33-5 / 2 
		s = s.replaceAll(" ", "");    //  33-5/2  -- > reduced to this
		System.out.println(s);
		
		char prevOperator = '+';     // default it to add operation
		int prevSum = 0;
		int prevMul = 0;
		int len = s.length();
		
		for(int iCnt = 0 ; iCnt < len ; iCnt++) {
			
			int start = iCnt;
			
			while(iCnt<len && Character.isDigit(s.charAt(iCnt)))   // take pointer till number end  33+
				iCnt++;                                                                           //  ^  -- pointer reaches here
																								  
			int currNum = Integer.parseInt(s.substring(start,iCnt));  // get number here i.e. 33
			
			switch(prevOperator) {
			
			case '+': 								// 1 st iteration
				prevSum = prevSum + currNum;        // 0 + 33 = 33
				prevMul = currNum;                  // 33
				break;
			case '-':								// 2 nd iteration
				prevSum = prevSum - currNum;        // 33 - 5 = 28 
				prevMul = -currNum;                 // -5
				break;
			case '*':										
				int tempMul = prevMul * currNum;    		 
				prevSum = (prevSum - prevMul) + tempMul;
				prevMul = tempMul;
				break;
			case '/':									// 3 rd iteration 
				int tempDiv = prevMul / currNum;    	// -5 / 2	
				prevSum = (prevSum - prevMul) + tempDiv;// ( 28 - (-5) ) + -2 = 33 - 2 = 31
				prevMul = tempDiv;
				break;
			default :
				break;
			
			}
			
			
			if(iCnt!=len) 
				prevOperator = s.charAt(iCnt);
			
		}
			
		
		
		System.out.println(prevSum);
		
		return prevSum;
	}

}


