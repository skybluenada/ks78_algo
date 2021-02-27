import java.io.*;
import java.util.*;

public class Test_1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		Deque<Integer> d1 = new LinkedList<Integer>(); // 왼쪽으로 이동시킬 큐
		Deque<Integer> d2 = new LinkedList<Integer>(); // 오른쪽으로 이동시킬 큐

		for (int i = 0; i < n; i++) { // 크기가 n인 큐
			d1.add(i + 1);
		}
		for (int i = 0; i < n; i++) { // 크기가 n인 큐
			d2.add(i + 1);
		}

		String[] ms = br.readLine().split(" ");
		int[] mc = new int[m];
		for (int i = 0; i < m; i++) { // m개의 숫자 뽑기
			mc[i] = Integer.parseInt(ms[i]); // 선택한 수의 위치 배열
		}

		int count = 0;
		
		for (int i = 0; i < mc.length; i++) {
			int count2 = 0;
			int count3 = 0;

			while (!d1.isEmpty()) {
				if (d1.peekFirst() != mc[i]) {
					d1.addLast(d1.pollFirst()); // 2번연산 왼쪽으로 한칸 이동
					count2++;
				} else {
					d1.pollFirst();
					break;
				}
			} // while end

			while (!d2.isEmpty()) {
				if (d2.peekFirst() != mc[i]) {
					d2.addFirst(d2.pollLast()); // 3번연산 오른쪽으로 한칸 이동
					count3++;
				} else {
					d2.pollFirst();
					break;
				}
			} // while end

			if (count2 > count3) {
				count += count3;
			} else {
				count += count2;
			}

		} // for end

		System.out.println(count);

	}// main end
}
