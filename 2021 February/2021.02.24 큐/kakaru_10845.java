package day33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_10845 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> queue = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(cnt < N) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String str = st.nextToken();
			switch(str) {
				case "push":
					int input = Integer.parseInt(st.nextToken());
					queue.add(input);
					cnt++;
					break;
				case "front":
					if(queue.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(queue.get(0)).append("\n");	
					}
					cnt++;
					break;
				case "back":
					if(queue.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(queue.get(queue.size()-1)).append("\n");	
					}
					cnt++;
					break;	
				case "pop":
					if(queue.isEmpty()) {
						sb.append("-1\n");						
					}
					else {
						sb.append(queue.get(0)).append("\n");
						queue.remove(queue.get(0));	
					}
					cnt++;
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					cnt++;
					break;
				case "empty":
					if(queue.isEmpty()) {
						sb.append("1\n");
					}
					else {						
						sb.append("0\n");
					}
					cnt++;
					break;		
			}
		}
		System.out.println(sb.toString());
	}
}
