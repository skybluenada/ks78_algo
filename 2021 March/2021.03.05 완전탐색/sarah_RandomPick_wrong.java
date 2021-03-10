package Programmers;

import java.util.*;

public class SearchRandomPick {
    public static int[] solution(int[] answers) {
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        
        for(int i=0; i<supo1.length; i++) {
        	q1.add(supo1[i]);
        }
        for(int i=0; i<supo2.length; i++) {
        	q2.add(supo2[i]);
        }
        for(int i=0; i<supo3.length; i++) {
        	q3.add(supo3[i]);
        }
        
        for(int i=0; i<answers.length; i++) {
        	value1 = q1.poll();
        	q1.offer(value1);
        	if(answers[i] == value1) {
        		count1++;
        	}	
        	value2 = q2.poll();
        	q2.offer(value2);
        	if(answers[i] == value2) {
        		count2++;
        	}
        	value3 = q3.poll();
        	q3.offer(value3);
        	if(answers[i] == value3) {
        		count3++;
        	}
        }//end for
         
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.offer(count1);
        pq.offer(count2);
        pq.offer(count3);
        
        int[] poll = new int[pq.size()];
        for(int i=0; i<poll.length; i++) {
        	poll[i] = pq.poll();
        }//end for - 값을 큰 순서대로 입력
       
        int countP = 0;

        for(int i=0; i<poll.length; i++) {
        	if(poll[0] ==  poll[i]) {
        		countP++;
        	}
        }//end for - 중복 값 몇개
        
      	int[] answer = new int[countP];
        if(countP < 3) {  
        	
        	if(poll[0] == count1) {
            	answer[0] = 1;
            }else if(poll[0] == count2){
            	answer[0] = 2;
            }else {
            	answer[0] = 3;
            }
        	if(countP > 1) {
        		answer[1] = answer[0]+1;
        	}
        }else {
        	answer[0] =1;
        	answer[1] =2;
        	answer[2] =3;
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		solution(answers);
	
		
		
	}
}
