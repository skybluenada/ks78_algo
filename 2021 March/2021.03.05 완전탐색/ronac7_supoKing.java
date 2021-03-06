import java.util.ArrayList;

public class Solution {
    public static int[] solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int score1 = 0, score2 = 0, score3 = 0;

        for (int i=0; i<answers.length; i++) {
            if ( supo1[i % supo1.length] == answers[i] ) score1++;
            if ( supo2[i % supo2.length] == answers[i] ) score2++;
            if ( supo3[i % supo3.length] == answers[i] ) score3++;
        }

        int max = Math.max(score1, Math.max(score2, score3));
        ArrayList<Integer> supoKing = new ArrayList<>();

        if ( max == score1 ) supoKing.add(1);
        if ( max == score2 ) supoKing.add(2);
        if ( max == score3 ) supoKing.add(3);

        int[] answer = new int[supoKing.size()];
        for (int i=0; i<supoKing.size(); i++) {
            answer[i] = supoKing.get(i);
        }
        return answer;
    }
}
