package day33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {
	public static void main(String[] args) throws IOException {
		Queue<Integer> q = new LinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		int chk = 1;
		while(!q.isEmpty()) {
			if(chk == K) {
				sb.append(q.poll()+", ");
				chk = 1;
			}
			else {
				q.add(q.poll());
				chk++;
			}
		}
		sb.delete(sb.length()-2, sb.length());
		String str = "<" + sb.toString() + ">";
		System.out.println(str);
	}
}
