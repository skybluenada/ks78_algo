import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		stack.add(str.charAt(0));
		int cnt = 0;
		int ans = 0;
		int idx = 0;
		while(idx < str.length()) {
			if(stack.isEmpty()) {
				stack.add(str.charAt(idx));
				cnt++;
			}
			else if(str.charAt(idx) == '(' && str.charAt(idx+1) == ')') {
				ans += cnt;
				idx+=2;
			}
			else if(stack.peek()=='(' && str.charAt(idx) == ')') {
				ans += 1;
				cnt--;
				idx++;
			}
			else if(stack.peek() == '(' && str.charAt(idx) == '(') {
				cnt++;
				idx++;
			}
		}
		System.out.println(ans);
		
		
	}
}	
