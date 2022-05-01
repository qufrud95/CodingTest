import java.util.*;
public class JadenCase {

    public static String solution(String s){
        
        String answer="";
        s = s.toLowerCase();
        answer += Character.toUpperCase(s.charAt(0));
        for (int i=1; i<s.length(); i++){
            if(s.charAt(i)==' '){
                answer+=" ";
            }else if(s.charAt(i-1)==' '){
                answer+=Character.toUpperCase(s.charAt(i));
            }else{
                answer+=s.charAt(i);
            }
        }
        //System.out.println(answer);
           
      
        return answer ; 

    }
    public static void main(String[] args) {
        

        String s = "3people unFollowed  me";
        System.out.println(solution(s));
    }
    
}
