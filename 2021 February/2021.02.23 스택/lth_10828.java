package backjun_10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Stack 객체 선언
		Stack<Integer> stack = new Stack<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine()); // 예외처리
		
		for (int i=0; i<n; i++) {
			
			// split() -> 괄호안에 쓴것을 기준으로 문자열을 분할한다.
			String[] input = br.readLine().split(" ");
			
			switch(input[0]) {
			case "push" :
				stack.push(Integer.parseInt(input[1]));
				break;
				
			case "pop" :
				if(stack.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(stack.pop() + "\n");
				}
				break;
			case "size" :
				bw.write(stack.size() + "\n");
				break;
				
			case "empty" :
				if(stack.empty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;
				
			case "top" :
				if (stack.empty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
				break;
			} // switch end
		}  // for end
		
		bw.flush();
		bw.close();
	}

}
