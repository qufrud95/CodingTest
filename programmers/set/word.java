package Set;

import java.util.*;

public class word {
    public static boolean solution(String[] words){

        // 1. set map을 통해 중복되지 않은  map을 구성 

        // 2. 순서가 보장이 되어야한다.

        HashSet<String>set = new HashSet<>();
        LinkedList<String> lit = new LinkedList<>();
        boolean answer =true;
        String temp = words[0].substring(words[0].length()-1,words[0].length());
        System.out.println(words[0]+","+temp);
        for (int i =0; i<words.length; i++){
            set.add(words[i]);
           
        }
        for(int j=1; j<words.length; j++){

            if(words[j].startsWith(temp)){
                temp = words[j].substring(words[j].length()-1,words[j].length());
            }else{
                //System.out.println("끝 말잇기 성립안됨");
                answer = false ;
                // 끝 말 잇기가 성립이 안됨
            }
        }
        
        if(set.size() == words.length){
            return answer ;
        }else{
            //System.out.println("중복이 존재합니다 .");
            answer = false;
        }



       
        return answer;

    }


    public static void main(String[] args) {
     
        String[] words ={"tank", "kick", "know", "wheel", "land", "dream"};
        System.out.println(solution(words));
    }
    
}
