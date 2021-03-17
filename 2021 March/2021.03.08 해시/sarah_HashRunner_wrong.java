package Programmers;
// vinko 이클립스에서는 답이 나오지만, 프로그래머스에서는 nikola가 나왔단다.... 왜일까???;;;;
import java.util.Arrays;

public class HashRunner {
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        int len = participant.length;
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for(int i=0; i<completion.length; i++) {
	        	if(participant[i] != completion[i]) {
	        		answer = participant[i];
	        	}else {
	        		answer = participant[len-1];
	        	}
	        }
	        
	        return answer;
	 }
	 
	 public static void main(String[] args) {
		
		 String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		 String[] completion = {"josipa", "filipa", "marina", "nikola"};
		 System.out.println(solution(participant, completion));
		 
	}
}

