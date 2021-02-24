import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static LinkedList<Integer> q = new LinkedList<Integer>(); //int형 큐 선언
	static int value = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			
			case "push" : push(Integer.parseInt(st.nextToken()));
					break;
			case "pop"  : pop();
					break;
			case "size" : size();
					break;
			case "empty": empty();
					break;
			case "front": front();
					break;
			case "back" : back();
					break;
			}//end switch	
		}//end for
		System.out.println(sb.toString());
		
	}//end main

	public static void push(int x) {
		q.add(x);
	}
	
	public static void pop() {
		if(!q.isEmpty()) {
			value = q.get(0);
			q.remove(0);
			sb.append(value).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}	
	
	public static void size() {
		sb.append(q.size()).append("\n");
	}	

	public static void empty() {
		if(!q.isEmpty()) {
			sb.append(0).append("\n");
		}else {
			sb.append(1).append("\n");
		}
	}
	
	public static void front() {
		if(!q.isEmpty()) {
			value = q.get(0);
			sb.append(value).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}	

	public static void back() {
		if(!q.isEmpty()) {
			value = q.size()-1;
			sb.append(q.get(value)).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}
}
