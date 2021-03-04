import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arr = null;
            arr = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1] );
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];

        }
        for (int i=0; i< commands.length; i++) {
            System.out.print(answer[i]+" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
