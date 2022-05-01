package ArrayList.Hash;

import java.util.HashMap;
import java.util.HashSet;

public class 위장 {
    
    public static int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        int answer = 1;
        
        for(int i =0; i<clothes.length; i++){ // 0 1  1 1  2 1
            if(map.containsKey(clothes[i][1])){

                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }else{
                map.put(clothes[i][1],1);
            }
        }
        for(String str : map.keySet()){
            answer *= map.get(str)+1;
        }
        System.out.println(map);
        System.out.println(answer);
        return answer-1;
    }

    public static void main(String[] args) {
        // headeger : 2 eyewear : 1
        // h / e / h // h e   he 
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}
