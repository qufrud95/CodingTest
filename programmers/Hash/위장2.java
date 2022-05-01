package ArrayList.Hash;
import java.util.*;
public class 위장2 {
    public static int solution(String[][] clothes) {
        //1. 위장 용품의 종류별 개수를 구한다.

        Map<String ,Integer> map = new HashMap();

        for(String[] c : clothes){
            String type = c[1];
            // {headgear : 1 }
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        
        //2. 각 개수의 +1을 모두 곱한다 
        int answer = 1;
        map.values().iterator();
        var iter = map.values().iterator();
        while(iter.hasNext()){

           answer *=iter.next()+1;
        }
        // 3. -1 한다
       
        return answer-1;
    }

    // headgear : 2 -> 3
    // eyewear : 1 -> 2   (착용하지 않은 것 )
    // 3*2 == 6 -1 

    public static void main(String[] args) {
        // headeger : 2 eyewear : 1
        // h / e / h // h e   he 
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
    
}
