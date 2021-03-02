package baekjoon;
//런타임 에러!!ㅠ
import java.io.*;
import java.util.*;

public class PriorityQueue_1966ver2 {

		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st1;
			StringTokenizer st2;
			StringBuilder sb = new StringBuilder();
			
			int num = Integer.parseInt(br.readLine());
			for(int i=0; i<num; i++) {
				
				int n = 0;
				int m = 0;
				int minN =0;
				int conutIdx =0;
				int count = 0;
				int minIndex = 0;
				int idx = 0;
				int value = 0;
				
				PriorityQueue<Integer> pq;
				
				st1 = new StringTokenizer(br.readLine()," ");
				n = Integer.parseInt(st1.nextToken());
				m = Integer.parseInt(st1.nextToken());
			
				LinkedList<Integer> list = new LinkedList<Integer>();
				pq = new PriorityQueue<Integer>(Collections.reverseOrder());
				if(n!=1) {	
					st2 = new StringTokenizer(br.readLine()," ");
					for(int j=0; j<n; j++) {
						list.add(Integer.parseInt(st2.nextToken()));
						pq.offer(list.get(j));
					}//end for - 값이 여러개일 때 테스트값 배열 입력
					
					for(int j=0; j<n; j++) {
						minN = pq.poll();
						if(pq.peek()==list.get(m)) break;				
					}
					minIndex = list.indexOf(minN); 
					
					for(int j=0; j<minIndex; j++) {
						list.addLast(list.get(0));
						list.removeFirst();					
					}//end for - 선택된 값 보다 첫번째 큰 수의 앞의 값을 모두 뒤로 보냄
					
					pq.clear();
					for(int j=0; j<n; j++) {
						pq.offer(list.get(j));
					}//end for - 새로 테스트값 배열 입력
					
					for(int j=0; j<n; j++) {
						value = pq.poll();
						idx = list.indexOf(value);
						list.remove(idx);
						count++;
						if(minN>idx) conutIdx++;
						if(value == minN) break;
					}
					
					int pickNewIdx = m+(n-minIndex)-conutIdx; // 선택 값의 새로운 자리 수 in 선택 값 보다 큰 수를 제외한 리스트
					int pickN = list.get(pickNewIdx);
					
					for(int j=0; j<=pickNewIdx; j++) {
						if(list.get(j)==pickN) {
							count++;
						}
					}// count 최종
					sb.append(count).append("\n");
				
				} else {
						Integer.parseInt(br.readLine()); //end for - 1 개일 때 
						count = 1;
						sb.append(count).append("\n");
				}//end for - 답 추출	 
			}//end outer for
			System.out.println(sb.toString());
		}//main
	}
