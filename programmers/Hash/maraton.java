package ArrayList.Hash;

import java.util.HashMap;

public class maraton {

    public static String solution(String[] participant, String[] completion){
        
        HashMap<String,Integer> map = new HashMap<>();
        int temp = 0;

        for(int i=0; i<participant.length; i++){
            if(map.containsKey(participant[i])){

                map.put(participant[i], map.get(participant[i])+1);
            }else{
                map.put(participant[i], 1);
            }
        }
        for(int j=0; j<completion.length; j++){

            if(map.containsKey(completion[j])){

                if(map.get(completion[j]) == 1){ // 1개가 남았다면  아예 지워버리고 
                    map.remove(completion[j]);
                }
                else if(map.get(completion[j])>=2){ //2개 이상이라면 1 감소 

                    map.put(completion[j],map.get(completion[j])-1);
                }
            }
        }
        // 1 leo : 1 과 같은 map 형태를 만든다 . 동명이인이 존재 할시 leo : 2 형태로 만든다.
        //System.out.println(map);
        String answer = "";
        for (String key : map.keySet()){
            answer = key;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant,completion));
    }
    
}
