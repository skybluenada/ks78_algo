package abc;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Stack3 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for(int n=0; n<t; n++) {
			int top = 0;
			int countPush = 0;
			int countPop = 0;
			String str = br.readLine();
			char[] arr = new char[str.length()];

			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}

			Stack<Character> stack = new Stack<>();
			for(int i=0; i<arr.length;i++) {

				if(arr[i] == '(') {
					countPush++;
					stack.push(arr[i]);
				}else if(arr[i] == ')'){
					countPop++;
					if(stack.empty()) {
						top=-1;
						break;
					}else {
						stack.pop();
					}
				}else if(stack.empty()){
					top=-1;
					break;	
				}//end outer if
			}//end for

			if((top==-1) && (countPush-countPop==0)) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}//end if
		}//outer for		
		System.out.println(sb.toString());

		br.close();
	}

}
