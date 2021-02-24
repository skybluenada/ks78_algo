import java.io.*;
import java.util.StringTokenizer;

public class Test_10845 {
	public static int[] qu;
	public static int size = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		qu = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				push(x);
				break;
			case "pop":
				bw.write(pop() + "\n");
				break;
			case "size":
				bw.write(size() + "\n");
				break;
			case "empty":
				bw.write(empty() + "\n");
				break;
			case "front":
				bw.write(front() + "\n");
				break;
			case "back":
				bw.write(back() + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
	
	
	public static void push(int x) {
		qu[size] = x;
		size++;
	}

	public static int pop() {
		if (size != 0) {
			int a = qu[0];
			qu[0] = 0;
			for (int i = 0; i < size - 1; i++) {
				qu[i] = qu[i + 1];
			}
			size--;
			return a;
		} else {
			return -1;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int front() {
		if (size == 0) {
			return -1;
		} else {
			return qu[0];
		}
	}

	public static int back() {
		if (size == 0) {
			return -1;
		} else {
			return qu[size - 1];
		}
	}

}
