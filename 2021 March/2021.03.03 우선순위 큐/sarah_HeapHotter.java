package Programmers;

import java.util.PriorityQueue;

class HeapHotter {
	public int solution(int[] scoville, int K) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<scoville.length; i++) {
			pq.offer(scoville[i]);
		}//end for - pq에 값 입력
		
		int value1 =0;
		int value2 =0;
		int count =0;
		
		while(pq.peek()<K) {
			if(pq.size() == 1) return -1; 
			value1 = pq.poll();
			value2 = pq.poll();
			pq.offer(value1+(value2*2));   
			count++;
		}//end while - K보다 작은 스코빌 지수 합을 pq에 삽입 
		
		return count;
    }
}
