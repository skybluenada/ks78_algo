package day28_abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_10866 {
	static LinkedList<Integer> deq = new LinkedList<Integer>(); //int형 큐 선언
	static int value = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
	
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			
			case "push_front": push_front(Integer.parseInt(st.nextToken()));
					break;
			case "push_back" : push_back(Integer.parseInt(st.nextToken()));
					break;		
			case "pop_front" : pop_front();
					break;
			case "pop_back"  : pop_back();
					break;
			case "size"		 : size();
					break;
			case "empty"	 : empty();
					break;
			case "front"	 : front();
					break;
			case "back" 	 : back();
					break;
			}//end switch	
		}//end for
		System.out.println(sb.toString());
	}
	
	public static void back() {
		if(!deq.isEmpty()) {
			value = deq.size()-1;
			sb.append(deq.get(value)).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}

	public static void front() {
		if(!deq.isEmpty()) {
			value = deq.get(0);
			sb.append(value).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}

	public static void empty() {
		if(!deq.isEmpty()) {
			sb.append(0).append("\n");
		}else {
			sb.append(1).append("\n");
		}
	}

	public static void size() {
		sb.append(deq.size()).append("\n");
	}

	public static void pop_back() {
		if(!deq.isEmpty()) {
			value = deq.get(deq.size()-1);
			deq.removeLast();
			sb.append(value).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}

	public static void pop_front() {
		if(!deq.isEmpty()) {
			value = deq.get(0);
			deq.removeFirst();
			sb.append(value).append("\n");
		}else {
			sb.append(-1).append("\n");
		}
	}

	public static void push_back(int x) {
		deq.addLast(x);
	}

	public static void push_front(int x) {
		deq.addFirst(x);
	}
}
