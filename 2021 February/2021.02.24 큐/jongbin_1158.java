import java.io.*;
import java.util.*;

public class Test_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> qu = new LinkedList<Integer>();

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		for (int i = 0; i < n; i++) {
			qu.add(i + 1);
		}
		
		while(!qu.isEmpty()) {
			for(int i = 0; i<k-1; i++) {
				qu.add(qu.poll());
			}
			if(qu.size()==1) {
				sb.append(qu.poll());
			}else {
				sb.append(qu.poll()).append(", ");
			}
		}
		System.out.print("<"+sb+">");
	}
}
