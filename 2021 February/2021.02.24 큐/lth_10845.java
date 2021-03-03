package backjun_10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder();

		int n = Integer.parseInt(br.readLine()); // 예외처리
		int a = 0;
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");

			switch (input[0]) {
			case ("push"):
				q.offer(Integer.parseInt(input[1]));
				a = Integer.parseInt(input[1]+1);
				break;

			case ("pop"):
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.poll() + "\n");
				}
				break;

			case ("size"):
				bw.write(q.size() + "\n");
				break;

			case ("empty"):
				if (q.isEmpty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;

			case ("front"):
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.peek() + "\n");
				}
				break;

			case ("back"):
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.peek() + "\n");
				}
				break;
			}

		}
		bw.flush();
		bw.close();

	}
}
