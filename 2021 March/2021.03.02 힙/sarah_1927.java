package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_1927 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list;
		PriorityQueue<Integer> pq;
		
		int n = Integer.parseInt(br.readLine());
		int value = 0;
		int count = 0;
		
		list = new ArrayList<Integer>();		
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}//end for - list 입력			
			
		pq = new PriorityQueue<Integer>();
			for(int i=0; i<n; i++) {
				if(list.get(i)!=0) {
					pq.offer(list.get(i));
				}else if(list.get(i)==0 && pq.size()>0) {
					value = pq.poll();
					sb.append(value).append("\n");
				}else {//(list.get(i)==0 && pq.size()==0)
					value = 0;
					sb.append(value).append("\n");
				}
			}//end for - 0제외 pq 입력 & 출력
			
		System.out.println(sb.toString());	
	}//main
}
