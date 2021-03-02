package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_11279 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list;
		PriorityQueue<Integer> pq;
		
		int n = Integer.parseInt(br.readLine());
		int value = 0;
		
		list = new ArrayList<Integer>();		
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}//end for - 입력			
			
		pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			for(int i=0; i<n; i++) {
				pq.offer(list.get(i));
				
				if(list.get(i) == 0) {
					value = pq.poll();
					sb.append(value).append("\n");
				}//end if - 0을 만나면 poll
			}//end for
			
		System.out.println(sb.toString());	
	}//main
}
