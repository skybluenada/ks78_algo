package Programmers;
//이클립스에서는 leo 정답이 나왔는데,
//프로그래머스에서는 "실행한 결괏값 "kiki"이(가) 기댓값 "leo"와(과) 다릅니다." 라고... 도대체 왜일까?????
import java.util.Arrays;

public class HashRunner {
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        int len = participant.length;
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        answer = participant[len-1];
	        for(int i=0; i<completion.length; i++) {
	        	if(participant[i] != completion[i]) {
	        		answer = participant[i];
	        	}
	        }
	        
	        return answer;
	 }
	 
	 public static void main(String[] args) {
		
		 String[] participant = {"leo", "kiki", "eden"};
		 String[] completion = {"eden", "kiki"};
		 System.out.println(solution(participant, completion));
		 
	}
}

