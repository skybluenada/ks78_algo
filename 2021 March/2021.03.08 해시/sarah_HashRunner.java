package Programmers;

import java.util.Arrays;

public class HashRunner {
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        int len = participant.length;
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        answer = participant[len-1];
	        for(int i=0; i<completion.length; i++) {
	        	if(!participant[i]..equals(completion[i])) {
	        		answer = participant[i];
				break;
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

