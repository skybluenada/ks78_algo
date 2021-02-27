import java.io.*;
import java.util.*;

public class Test_10866_list {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Deque<Integer> d = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "push_front":
				d.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				d.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if (!d.isEmpty()) {
					sb.append(d.getFirst()).append("\n");
					d.removeFirst();
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "pop_back":
				if (!d.isEmpty()) {
					sb.append(d.getLast()).append("\n");
					d.removeLast();
				} else {
					sb.append(-1).append("\n");
				}
				break;
			case "size":
				sb.append(d.size()).append("\n");
				break;
			case "empty":
				if (d.isEmpty() == true) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "front":
				if(!d.isEmpty()) {
					sb.append(d.getFirst()).append("\n");
				}else {
					sb.append(-1).append("\n");
				}
				break;
			case "back":
				if(!d.isEmpty()) {
					sb.append(d.getLast()).append("\n");
				}else {
					sb.append(-1).append("\n");
				}
				break;
			}// switch end

		} // for end

		System.out.println(sb);
	}// main end

}// class end
