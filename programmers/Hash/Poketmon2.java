package ArrayList.Hash;

import java.util.HashSet;
import java.util.LinkedList;

public class Poketmon2 {
    // list를 이용한 풀이
    public static int solution(int[] nums){
        LinkedList<Integer> list = new LinkedList<>();
        int answer = 0;
        for(int n : nums){
            if(!list.contains(n)) list.add(n);
        }
        int size = list.size(); // list 의 사이즈 
        int length = nums.length / 2 ; // 총 가질 수 있는 갯수         
        System.out.println(list);
        return Math.min(size,length);
    }

    public static void main(String[] args) {
        
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));


    }
    
}
