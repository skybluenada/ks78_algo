// import java.util.Arrays;

// public class Solution {


//     public static void main(String[] args) {
//         int[] array={1, 5, 2, 6, 3, 7, 4};
//         int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
//         int[] answer = new int[commands.length] ;
//         for(int i = 0; i < commands.length; i++){
//             int[] tmp = new int[commands[i][1]-commands[i][0]+1];
//             int idx = 0;
//             for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
//                 tmp[idx] = array[j];
//                 idx++;
//             }
//             Arrays.sort(tmp);
//             answer[i]=tmp[commands[i][2]-1];
//         }
//         for(int i : answer){
//             System.out.println(i);
//         }
//     }
// }

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length] ;
        for(int i = 0; i < commands.length; i++){
            int[] tmp = new int[commands[i][1]-commands[i][0]+1];
            int idx = 0;
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                tmp[idx] = array[j];
                idx++;
            }
            Arrays.sort(tmp);
            answer[i]=tmp[commands[i][2]-1];
        }
        return answer;
    }
}
