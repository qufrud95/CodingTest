import java.util.ArrayList;

import java.util.Stack;

class Solution {
     public static ArrayList<Integer> solution(int[] progresses, int[] speeds){
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 0;
		int temp2 = 0;
		int count = 0;
		float num = 0;
	       
		for(int i=progresses.length-1; i>=0; i--) {
			
			num = (float) ((100.0 - progresses[i]) / speeds[i]) ;  
			//System.out.println(num);
			if ( num % 1 != 0) {
				stack.push((int)num+1);
			}else {
				stack.push(Math.round(num));
			}
					
		}
		//System.out.println(" stack : "+ stack);
		temp = stack.pop(); // 7을 담아 놓고 
		
		while(stack.size() !=0) {
			
			//System.out.println("현재 비교대상은 : "+temp);
			temp2 = stack.pop(); // 하나 꺼내와서 비교 
			//System.out.println("비교대상 : "+temp2);
			
			if(temp>=temp2) { // 아직 작업이 남았을경우 
				
			
				temp2 = 0;	count +=1;
				/*
				System.out.println("list : "+list);
				System.out.println("count : "+count);
				System.out.println("stack size : "+stack.size());
				System.out.println("\n");
				*/
				if(stack.size() == 0) {
					count+=1;
					list.add(count);
					break;
				}
				
			}
			else if (temp < temp2){ //먼저 들어온 작업보다 더 긴 작업이 있는 경우 
				
				list.add(count+1);
				temp = temp2;
				count = 0;
				/*
				System.out.println("list : "+list);
				System.out.println("count : "+count);
				System.out.println("stack size : "+stack.size());
				System.out.println("\n");
				*/
				if(stack.size() == 0 ) {
					count +=1;
					list.add(count);
					break;
					
				}
			}

			
			
		}
		    return list;
	
	}
}