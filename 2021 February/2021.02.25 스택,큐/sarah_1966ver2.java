package baekjoon;
//정수로만 풀어야하는데, 실수로 풀어서 틀림!ㅠ
import java.io.*;
import java.util.*;

public class PriorityQueue_1966 {

		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st1;
			StringTokenizer st2;
			StringBuilder sb = new StringBuilder();
			
			int num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++) {
				
				int sizeQ = 0;
				int pickN = 0;
				int count = 0;
				int countA = 0;
				double min = 0.0;
				double compN =0.0;
				double value = 0.0;
				
				PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
				
				st1 = new StringTokenizer(br.readLine()," ");
				sizeQ = Integer.parseInt(st1.nextToken());
				pickN = Integer.parseInt(st1.nextToken());
				double[] arr = new double[(int) sizeQ];
				
				if(sizeQ!=1) {	
					st2 = new StringTokenizer(br.readLine()," ");
					for(int j=0; j<sizeQ; j++) {
						arr[j]=Double.parseDouble(st2.nextToken());
						pq.offer(arr[j]);
					}//end for - 여러개일 때 테스트값 배열 입력
					
					for(int j=0; j<sizeQ; j++) {
						min = pq.poll();
						if(pq.peek()==arr[pickN]) break;				
					}
					for(int j=sizeQ-1; j>=0; j--) {
						countA++;
						if(arr[j] == min) break;
					}//end for - 선택된 값 arr[pickN] 보다 첫번째 큰 수의 자리 찾기
					
					int stand = sizeQ-countA;
					compN = arr[pickN];
					
					for(int j=0; j<stand; j++) {
						if(arr[j] == compN) {
							arr[j] -= ((double)j+1)/100;
						}
					}
					for(int j=countA-1; j<sizeQ; j++) {
						if(arr[j] == compN) {
							arr[j] += (double)j/100;
						}
					}//end for - 선택된 값의 중복 값 순위를 다르게 만듬
			
					pq.clear();
					
					for(int j=0; j<sizeQ; j++) {
						pq.offer(arr[j]);
					}//end for 큐(우선순위출력)입력
					
				} else {
					for(int j=0; j<sizeQ; j++) {
						arr[j]=Double.parseDouble(br.readLine()); 
						pq.offer(arr[j]);
					}//end for - 1 개일 때 테스트값 배열 입력
				}
				
				for(int j=0; j<sizeQ; j++) {
					value = pq.poll();
					count++;

					if(value == arr[pickN]) {
						sb.append(count).append("\n");
					}
				}//end for - 답 추출	 
			}//end outer for
			System.out.println(sb.toString());
		}//main
	}
