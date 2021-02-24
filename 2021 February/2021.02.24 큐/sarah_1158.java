package day28_abc;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		int n = 0;
		int k = 0;
		int value = 0;
		
		//n, k
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i=1; i<k; i++) {
				q.offer(q.poll());				
			}
			
			if(q.size()>1) {
				sb.append(q.poll()+", ");
			}else if(q.size()==1) {
				sb.append(q.poll());
			}
		}//end while
		System.out.println("<"+sb.toString()+">");
	}//main
}



