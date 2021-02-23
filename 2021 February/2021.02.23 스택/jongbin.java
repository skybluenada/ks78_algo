package day0222;

import java.io.*;
import java.util.Stack;

public class Test_9012_stack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] s;

		for (int i = 0; i < n; i++) {
			Stack<Integer> st = new Stack<Integer>();
			s = br.readLine().split("");
			for (int j = 0; j < s.length; j++) {
				if (s[j].equals("(")) {
					st.push(j);
				} else if (s[j].equals(")")) {
					if (!st.empty()) {
						st.pop();
					} else {
						st.push(j);
						break;
					}
				}
			}
			
			if(st.empty()) {
				sb.append("YES").append("\n");
			}else{
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
