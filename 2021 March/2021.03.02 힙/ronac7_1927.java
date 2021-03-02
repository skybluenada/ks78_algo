package _1927_minHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> minHeap = new ArrayList<>();
        minHeap.add(0); // 인덱스 1부터 시작하기 위해 0 삽입

        for ( int i=0; i<n; i++ ) { // 입력된 n개의 input 에 대해서 반복
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if ( minHeap.size() == 1) { // 비었을 경우 0 출력
                    sb.append(0).append('\n');
                }
                else { // 비어있지 않을 경우 루트노드 출력, 마지막 노드 1번에 놓기
                    sb.append(minHeap.get(1)).append('\n');
                    minHeap.set(1,minHeap.get(minHeap.size()-1));
                    minHeap.remove(minHeap.size()-1);

                    int pos = 1;
                    while ((pos*2) < minHeap.size()) {
                        int min = minHeap.get(pos * 2);
                        int minPos = pos*2;

                        if (((pos*2+1) < minHeap.size()) && min > minHeap.get(pos*2+1)) {
                            min = minHeap.get(pos*2+1);
                            minPos = pos*2+1;
                        }

                        if (minHeap.get(pos) < min) {
                            break;
                        }

                        int tmp = minHeap.get(pos);
                        minHeap.set(pos,minHeap.get(minPos));
                        minHeap.set(minPos, tmp);
                        pos = minPos;
                    }
                } // 비어있지 않을 경우 루트노드 출력 후 자리바꾸기 완료
            } // input 이 0인경우
            else {
                minHeap.add(input);
                int newNum = minHeap.size()-1;
                while (newNum > 1 && minHeap.get(newNum/2) > minHeap.get(newNum)) {
                    int tmp = minHeap.get(newNum/2);
                    minHeap.set(newNum/2, minHeap.get(newNum));
                    minHeap.set(newNum, tmp);

                    newNum /= 2;
                }
            }
        }
        System.out.println(sb);
    }
}
