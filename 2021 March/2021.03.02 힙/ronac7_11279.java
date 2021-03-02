package _11279_maxHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> maxHeap = new ArrayList<>();
        maxHeap.add(0); // 인덱스 1부터 시작하기 위해 0 삽입

        for ( int i=0; i<n; i++ ) { // 입력된 n개의 input 에 대해서 반복
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if ( maxHeap.size() == 1) { // 비었을 경우 0 출력
                    sb.append(0).append('\n');
                }
                else { // 비어있지 않을 경우 루트노드 출력, 마지막 노드 1번에 놓기
                    sb.append(maxHeap.get(1)).append('\n');
                    maxHeap.set(1,maxHeap.get(maxHeap.size()-1));
                    maxHeap.remove(maxHeap.size()-1);

                    int pos = 1;
                    while ((pos*2) < maxHeap.size()) {
                        int max = maxHeap.get(pos * 2);
                        int maxPos = pos*2;

                        if (((pos*2+1) < maxHeap.size()) && max < maxHeap.get(pos*2+1)) {
                            max = maxHeap.get(pos*2+1);
                            maxPos = pos*2+1;
                        }

                        if (maxHeap.get(pos) > max) {
                            break;
                        }

                        int tmp = maxHeap.get(pos);
                        maxHeap.set(pos,maxHeap.get(maxPos));
                        maxHeap.set(maxPos, tmp);
                        pos = maxPos;
                    }
                } // 비어있지 않을 경우 루트노드 출력 후 자리바꾸기 완료
            } // input 이 0인경우
            else {
                maxHeap.add(input);
                int newNum = maxHeap.size()-1;
                while (newNum > 1 && maxHeap.get(newNum/2) < maxHeap.get(newNum)) {
                    int tmp = maxHeap.get(newNum/2);
                    maxHeap.set(newNum/2, maxHeap.get(newNum));
                    maxHeap.set(newNum, tmp);

                    newNum /= 2;
                }
            }
        }
        System.out.println(sb);
    }
}
