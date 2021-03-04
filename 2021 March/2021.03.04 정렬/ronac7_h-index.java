public class Solution {
    public static int solution(int[] citations) {
        int answer = 0;
        int h = citations.length;
        for (int i = citations.length; i >= 0; i--) {
            if (h == 0) {
                answer = 0;
                break;
            }
            int count = 0;
            for (int j=0; j<citations.length; j++) {
                if ( citations[j] >= h ) {
                    count++;
                }
            }
            if (count >= h) {
                answer = h;
                break;
            }
            h--;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        solution(new int[]{3,0,6,1,5});
    }

}
