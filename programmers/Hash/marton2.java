package ArrayList.Hash;

import java.util.*;

public class marton2 {
    public static String solution(String[] participant, String[] completion){
        
        HashMap<String,Integer> map = new HashMap<>();
        String answer= "";
        for(String p : participant){
            map.put(p, map.getOrDefault(p,0)+1); //gerOrDefault 사용시 (key,value) value가 존재하지 않다면 0 존재한다면 +1
            System.out.println(map);
        }
        for(String c : completion){
            int n = map.get(c)-1;
            if (n == 0 ) map.remove(c);
            else map.put(c,n);
        }

      
        return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant,completion));
    }
    
}
