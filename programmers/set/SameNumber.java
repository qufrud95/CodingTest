package Set;
import java.util.*;
public class SameNumber {
    public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i=0; i<arr.length; i++){

            if(arr[i] != temp){
                list.add(arr[i]);
                temp = arr[i];
            }
        }
        // list to Array
        //ist.stream().mapToInt(Integer::intValue).toArray();
        return list;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,3,3,0,1,1,3,3,1};
        System.out.println(solution(arr));

    }
    
}
