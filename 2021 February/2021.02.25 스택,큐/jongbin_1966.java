import java.io.*;
import java.util.*;

public class Test_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c = Integer.parseInt(br.readLine()); // test 횟수

		for (int z = 0; z < c; z++) {
			String[] nm = br.readLine().split(" ");

			int n = Integer.parseInt(nm[0]); // 문서의 개수
			int m = Integer.parseInt(nm[1]); // 문서의 위치(0번째 부터)

			String[] p = br.readLine().split(" "); // 각 문서의 중요도 입력

			LinkedList<Integer> docu = new LinkedList<Integer>(); // 문서배열

			for (int i = 0; i < n; i++) {
				docu.add(i);
			}
			int result = docu.get(m);		// m번째 위치한 문서(0 ~ n-1)

			LinkedList<Integer> imp = new LinkedList<Integer>();
			
			for (int i = 0; i < n; i++) {
				imp.add(Integer.parseInt(p[i])); // 중요도 배열 큐
			}

			int count = 0;
			while (!imp.isEmpty()) {
				int max = -1;
				boolean out = false;

				for (int j = 0; j < docu.size(); j++) {
					if (imp.get(j) > max) {
						max = imp.get(j);
					}
				} //for end 가장 높은 중요도 추출, 중복이면 max = -1

				if (max != -1) {	// 중요도 중복이 없을 경우
					while (!docu.isEmpty()) {
						if (imp.peek() == max) {
							if (docu.peek() == result) {
								count++;
								out = true;
								break;
							} else {
								docu.poll();
								imp.poll();
								count++;
								break;
							}
						} else {
							imp.add(imp.poll());
							docu.add(docu.poll());
						}
					}//in while end
					
				} else if (max == -1) {		//중요도 중복이 있을 경우
					while (!docu.isEmpty()) {
						if (docu.peek() == result) {
							count++;
							out = true;
							break;
						} else {
							docu.poll();
							imp.poll();
							count++;
							break;
						}
					}//in while end
				}
				
				if (out == true)
					break;
			} // while end
			
			sb.append(count+"\n");
		} // for end
		
		System.out.println(sb);
	}
}
