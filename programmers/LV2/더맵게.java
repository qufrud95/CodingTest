import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class 더맵게 {
    public static int solution(int[] scoville, int K) {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(scoville);
        int first = 0;
        int count = 0;
        int second = 0 ;
        int scov = 0;
        for(int i=0; i<scoville.length; i++){
            deque.addLast(scoville[i]);
        }
        
        while(true){
            scov = deque.getFirst();
            System.out.println("현재 first : "+scov);
            deque.removeFirst();
            System.out.println("1. deque :"+deque);
            int temp = deque.getFirst();
                if (scov >=K && temp >=K){
                    break;
                }
                else{
                    second = deque.getFirst();
                    System.out.println("현재  second : "+second);
                    deque.removeFirst();
                    System.out.println("1. deque :"+deque);
                    if (scov >= second){
                        scov = second + (scov*2);
                    }else{

                        scov = scov + (second*2);
                    }
                    System.out.println("scov : "+scov);
                    deque.addFirst(scov);
                    System.out.println("2. deque :"+deque);
                    count +=1;

                }
        }
        System.out.println("count : "+count);
        System.out.println(deque);
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville,k));
    }
    
}
