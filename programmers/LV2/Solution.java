

public class Solution {
    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int [arr1.length][arr2[0].length];
        int sum = 0;
        int sum2 = 0;
        
        for(int i=0; i<arr1.length; i++){
            
            for(int j=0; j<arr2[0].length; j++){
               for(int k=0;  k<arr1[0].length; k++){

                   System.out.println(arr1[i][k]  * arr2[k][j]);
                   answer[i][j] += arr1[i][k]  * arr2[k][j];
               }
               System.out.println("============================");
            }
        }
        
      
            

        return answer;
        
    }
    public static void main(String[] args) {
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};  
        /*[[2, 3, 2], // [[5, 4, 3] 
          [4, 2, 4],      [2, 4, 1]
          [3, 1, 4]]       [3, 1, 1]]
         */  
        int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}}; 
        System.out.println(solution(arr1,arr2));
    }
}


