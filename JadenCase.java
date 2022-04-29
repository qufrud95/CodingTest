import java.util.*;
public class JadenCase {

    public static String solution(String s){
        
        String answer="";
        String[] sp = s.toLowerCase().split("");
        boolean flag =true;

        for(String ss : sp){

            answer+= flag? ss.toUpperCase() : ss; // true이면 대문자로 아니면 소문자로 대입
            flag = ss.equals(" ")?true:false; //공백이면 true 아니면 false 즉 공백이 시작되는것은 문자열의 첫번째이기 때문
        }

        System.out.println(answer);
           
      
        return answer ; 

    }
    public static void main(String[] args) {
        

        String s = "3people unFollowed  me";
        System.out.println(solution(s));
    }
    
}
