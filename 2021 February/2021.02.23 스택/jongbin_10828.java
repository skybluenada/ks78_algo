package day0208;

import java.io.*;
import java.util.*;


public class Test_10828 {
	static int[] a ;
	int size = 0;
	
	public void push(int x) {
		 a[size] = x;
		 size++;
	}

	public int pop() {
		if (size == 0) {
			return -1;
		} else {
			int i = a[size-1];
			a[size-1] = 0;
			size--;
			return i;
		}
	}

	public int size() {
		return size;
	}

	public int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (size == 0) {
			return -1;
		} else {
			return a[size-1];
		}
	}
	
	public static void main(String[] args) throws IOException {
		Test_10828 t = new Test_10828();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		a = new int[n];
		for (int i = 0; i < n; i++) {
			String[] ob = br.readLine().split(" ");
			switch (ob[0]) {
			case "push":
				t.push(Integer.parseInt(ob[1]));
				break;
			case "pop":
				sb.append(t.pop()).append("\n");
				break;
			case "size":
				sb.append(t.size()).append("\n");
				break;
			case "empty":
				sb.append(t.empty()).append("\n");
				break;
			case "top":
				sb.append(t.top()).append("\n");
				break;
		
			}// switch end
		} // for end
		System.out.println(sb);
	}// main end

}
