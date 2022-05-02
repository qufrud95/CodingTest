package Set;


import java.util.*;

public class Lotto {
    /*
    중복이 존재하는지 여부  처음 arr의 사이즈와 set 했을시 
    size를 체크한다 
    */

    public static boolean solution(int[] lotto){

        HashSet<Integer> set = new HashSet<>();
        boolean answer = true;
        int len = lotto.length;
        for (int i : lotto){
            set.add(i);
        }
  
        if(len == set.size()) return answer;
        else answer = false;

        return answer; 


    }

    public static void main(String[] args) {
        

        int[] lotto = {3, 19, 34, 39, 39, 20};
        
        System.out.println(solution(lotto));
    }
    
}
