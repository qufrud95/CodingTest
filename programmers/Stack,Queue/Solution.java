import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static int solution(int[] priorities, int location) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        Deque<String>deq = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            
            deq.addLast(Integer.toString(priorities[i]));
        }

        System.out.println("deq : "+ deq);

        

        return location;
        

    }
    public static void main(String[] args) {


        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
        /*
        [2, 1, 3, 2]	2	1
        [1, 1, 9, 1, 1, 1]	0	5
        */
        

        /*

                0 <= location <= priorities.length -1 
                숫자가 높을 수록 중요도가 높음 3 > 2 > 1
        */
    }
}


