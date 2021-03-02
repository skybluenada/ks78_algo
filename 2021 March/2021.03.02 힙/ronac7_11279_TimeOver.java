package _11279_maxHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_TimeOver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> maxHeap = new LinkedList<>();
        maxHeap.add(0);

        for ( int i=0; i<n; i++ ) { // 입력된 n개의 input 에 대해서 반복
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if ( maxHeap.size() == 1) { // 비었을 경우 0 출력
                    sb.append(0).append('\n');
                }
                else { // 비어있지 않을 경우 루트노드 출력, 마지막 노드 1번에 놓기
                    maxHeap.pollFirst();
                    sb.append(maxHeap.pollFirst()).append('\n');
                    if (!maxHeap.isEmpty()) {
                        maxHeap.addFirst(maxHeap.pollLast());
                    }
                    maxHeap.addFirst(0);

                    if ( maxHeap.size() > 2 && maxHeap.size() % 2 == 0) { // 1번에 놓인 놈 자식들과 비교해서 자리바꿔나가기
                        for (int j = 1; Math.pow(2,j) < maxHeap.size(); j++) {
                            if ( maxHeap.get(j*2) >= maxHeap.get(j*2+1) && maxHeap.get(j) < maxHeap.get(j * 2)) {
                                int tmp = maxHeap.get(j*2);
                                maxHeap.set(j*2, maxHeap.get(j));
                                maxHeap.set(j, tmp);
                            }
                            else if ( maxHeap.get(j*2) < maxHeap.get(j*2+1) && maxHeap.get(j) < maxHeap.get(j * 2 + 1)) {
                                int tmp = maxHeap.get(j*2+1);
                                maxHeap.set(j*2+1, maxHeap.get(j));
                                maxHeap.set(j, tmp);
                                j++;
                            }
                            else {
                                break;
                            }
                        }
                    } // 자식들과 비교하여 자리바꾸기 종료
                    else if ( maxHeap.size() > 2 && maxHeap.size() % 2 == 1) {
                        for (int j = 1; Math.pow(2,j) < maxHeap.size(); j++) {
                            if ( maxHeap.get(j) < maxHeap.get(j * 2)) {
                                int tmp = maxHeap.get(j*2);
                                maxHeap.set(j*2, maxHeap.get(j));
                                maxHeap.set(j, tmp);
                            }
                            else {
                                break;
                            }
                        }
                    }
                } // 비어있지 않을 경우 루트노드 출력 후 자리바꾸기 완료
            } // input 이 0인경우
            else {
                maxHeap.add(input);
                if ( maxHeap.size() > 2 ) {
                    for (int j = maxHeap.size()-1; j > 1; j /= 2) {
                        if (maxHeap.get(j) > maxHeap.get(j/2)) {
                            int tmp = maxHeap.get(j/2);
                            maxHeap.set(j/2, maxHeap.get(j));
                            maxHeap.set(j, tmp);
                        }
                        else {
                            break;
                        }
                    }
                }
            }
//            System.out.println(maxHeap);
        }
        System.out.println(sb);
    }
}
