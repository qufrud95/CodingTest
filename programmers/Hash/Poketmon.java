package ArrayList.Hash;

import java.util.HashSet;

public class Poketmon {

    public static int solution(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        int answer = 0;
        int n = nums.length / 2 ; // 총 가질수 있는 몬스터의 갯수 
        for(int i=0; i<nums.length;i++){
            set.add(nums[i]);
        }

        // 가질 수 있는 갯수 보다 set.size()가 크다면 return n
        answer =  Math.min(n, set.size());
        /*
        if( n < set.size()){

            answer = n ;
        }else if (n >= set.size()){
            answer = set.size();
        }
        */
        //System.out.println(set.size());
        //System.out.println(n);



        return answer;
    }

    public static void main(String[] args) {
        
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));


    }
    
}
