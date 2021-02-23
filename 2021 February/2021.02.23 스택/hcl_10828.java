package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> stack = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
 		for(int i =0; i< N;i++) {
 			String input = sc.next();
 			switch (input) {
			case "push":
				int num = sc.nextInt();
				stack.add(num);
				break;
			case "top":
				if(stack.isEmpty())  {
					sb.append("-1\n");
				}			
				else {
					sb.append(stack.get(stack.size() - 1) + "\n");
				}
				break;
			case "empty":
				if(stack.isEmpty()) {
					sb.append("1\n");
				
				}
				else {
					sb.append("0\n");
					
				}
				break;
			case "size" :
				sb.append(stack.size()+"\n");
				
				break;
			case "pop" :
				if(stack.isEmpty()) {
					sb.append("-1\n");
				
				}
				else {
					sb.append(stack.remove(stack.size()-1)+"\n");
					
				}
				break;

			
			}
			
		}
 		System.out.println(sb.toString());
	}
	
}
