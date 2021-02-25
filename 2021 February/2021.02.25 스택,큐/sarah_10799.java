package day28_abc;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main_10799 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		int top = 0;
		int left = 0;
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='(') {
					top++;
					stack.push('(');
			}else { //)
				if(arr[i-1]=='(') {
					stack.pop();
					top--;
					left += top;
				}else {
					left +=1;
					stack.pop();
					top--;
				}//end inner if	
			}//end outer if
		}//end for
		
		System.out.println(left);
	}
}
