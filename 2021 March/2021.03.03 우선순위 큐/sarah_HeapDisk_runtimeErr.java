package Programmers;

import java.util.PriorityQueue;

public class HeapDisk {
	
	
	 public static int solution(int[][] jobs) {
	       
	        PriorityQueue<Double> pq = new PriorityQueue<Double>();
	   
	        int answer = 0;
	        int first = 0;
	        int second = jobs[0][1];
	        double addTime = 0;
	        double poll = 0;
	        double ready = 0;
	        double request = 0;

	        while(pq.size() != jobs.length-2) {  
		        for(int i=1; i<jobs.length; i++) {
			        if(first<jobs[i][0] && jobs[i][0]<=second) {
			        	pq.offer((double)(jobs[i][1])+(double)(jobs[i][0])/10);
			        }
		        }//end for
		        poll = pq.poll();
		        addTime = Math.floor(poll);
		        first = second;
		        second += addTime;
		        request = Math.round((poll-addTime)*10);
		        ready += second - addTime - request;

	        }//end while
	        
	        poll = pq.poll();
	        addTime = Math.floor(poll);
	        second += addTime;
	        request = Math.round((poll-addTime)*10);
	        ready += second - addTime - request;

	        answer = (int) ((second+ready)/jobs.length);
	        return answer;
	              
	 }
	 public static void main(String[] args) {
	
		 int[][] jobs = new int[3][2];
	
		 jobs[0][0] = 0;
		 jobs[0][1] = 3;
		 jobs[1][0] = 1;
		 jobs[1][1] = 9;
		 jobs[2][0] = 2;
		 jobs[2][1] = 6;
		 
		System.out.println("answer : " + solution(jobs));
	 } 
}
