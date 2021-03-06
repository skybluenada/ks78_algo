import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
    
		int[] supo1 = { 1, 2, 3, 4, 5 }; // 5
		int[] supo2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 8
		int[] supo3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 10
		int[] supo11 = new int[answers.length];
		int[] supo22 = new int[answers.length];
		int[] supo33 = new int[answers.length];
     
    //입력받은 답안지 길이 만큼 배열 생성 
		int k = answers.length;
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < supo1.length; j++) {
				supo11[i] = supo1[j];
				i++;
				k--;
				if (k == 0)
					break;
			}
		}
		int f = answers.length;
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < supo2.length; j++) {
				supo22[i] = supo2[j];
				i++;
				f--;
				if (f == 0)
					break;
			}
		}
		int g = answers.length;
		for (int i = 0; i < answers.length;) {
			for (int j = 0; j < supo3.length; j++) {
				supo33[i] = supo3[j];
				i++;
				g--;
				if (g == 0)
					break;
			}
		}
      
    //정답수 count  
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < answers.length; i++) {
			if (supo11[i] == answers[i]) {
				count1++;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (supo22[i] == answers[i]) {
				count2++;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (supo33[i] == answers[i]) {
				count3++;
			}
		}
		 
      //max값 추출. 순서 때문에 ArrayList사용
        int max = Math.max(Math.max(count1, count2), count3);
        ArrayList<Integer> maxA = new ArrayList<Integer>();
        if(max==count1) {
        	maxA.add(1);
        }
        if(max==count2) {
        	maxA.add(2);
        }
        if(max==count3) {
        	maxA.add(3);
        }
        
      // return 위해서 일반 배열 answer에 대입
        int[] answer = new int[maxA.size()];
        for(int i = 0; i < maxA.size(); i++) {
        	answer[i] = maxA.get(i);
        }
      
        return answer;
    }
}
