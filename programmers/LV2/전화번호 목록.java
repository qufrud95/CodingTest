import java.util.*;
class Solution {

	  public static boolean solution(String[] phone_book) {
		  String temp = phone_book[0];
		  String left = "";
		  String right = "";
		  int min = 0;
		  int max = 0;
		  boolean answer = true;
		  Arrays.sort(phone_book);
		  
		  int len = temp.length();
		  String word ="";
		  for (int i = 1; i<phone_book.length; i++) {  
			 left = phone_book[i-1];
			 right = phone_book[i];
			// System.out.println("left : "+left);
			// System.out.println("right : "+right);
			 if(left.length()< right.length()) {
				 
				 if(right.startsWith(left)) {
					 
					 answer = false;
					 break;
				 }
			 }else if(left.length()> right.length()) {
				 if(left.startsWith(right)) {
					 
					 answer = false;
					 break;
				 }
			 }
			 

		  }
		
	        return answer;
	}
}