package day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i <N; i++) {
			Stack<Character> st = new Stack<>();
			String str = br.readLine();
			st.push(str.charAt(0));			
			for(int j = 1; j < str.length(); j++) {
				if(!st.isEmpty() && st.peek() == '(' && str.charAt(j) ==')') {
					st.pop();
				}
				else {
					st.push(str.charAt(j));
				}					
			}
			if(st.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
}
