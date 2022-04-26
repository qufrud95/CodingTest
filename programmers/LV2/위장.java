import java.util.HashMap;
import java.util.Iterator;

class Solution {
   public static int solution(String[][] clothes) {

		HashMap<String,Integer> map = new HashMap<String, Integer>();
		String key ="" ;
		int answer = 1; 
		
		for(int i=0; i<clothes.length; i++) {
			
			key = clothes[i][1];
			// 종류가 존재한다면 1 증가 
			if (map.containsKey(key)) {
				
				map.put(key,map.get(key)+1); // 해당 키의 value에 접근 
			} 
			// 존재하지 않다면 1로 initialize 
			else {
			
				map.put(key, 1);
				
			}
		}
		System.out.println("map : "+map);
		key = "";
		
		for(String key1 : map.keySet()) {
			
			answer *= map.get(key1)+1;
			
		}
//		Iterator<Integer>  itr =map.values().iterator();
//		while( itr.hasNext()) {
//			
//			answer *= itr.next().intValue()+1;
//			
//		}
//		System.out.println(answer);
		
		/*
		 * 
		 * 
		 * 경우의 수 (a+1)*(b+1)-1 
		 * 
		 */
		
		
		return answer-1; // 다 입은 경우 빼주기 
	
	}
}