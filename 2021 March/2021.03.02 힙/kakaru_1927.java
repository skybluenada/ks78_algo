import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int idx = 0;
        int[] heap = new int[200004];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){     // 0입력받음
                if(idx<=0){     // -> 비었으면 0출력,
                    sb.append("0\n");
                }
                else{   // -> 안비었으면 1번 출력하고 1번 삭제과정
                    sb.append(heap[1]+"\n");
                    if(idx != 1){
                        heap[1] = heap[idx];
                        heap[idx] = 0;
                    }
                    else{
                        heap[1]= 0;
                    }
                    for(int j = 1; j <= idx;){
                        int cmp;
                        if(heap[j*2+1]==0 && heap[j*2]==0){
                            break;
                        }
                        else if(heap[j*2+1]==0){
                            cmp = j*2;
                        }
                        else if(heap[j*2+1]<heap[j*2]){
                            cmp = j*2+1;
                        }
                        else{
                            cmp = j*2;
                        }
                        if(heap[cmp] < heap[j]){
                            int tmp = heap[j];
                            heap[j] = heap[cmp];
                            heap[cmp] = tmp;
                            j = cmp;
                        }
                        else{
                            break;
                        }
                    }
                    idx--;
                }
            }
            else{   // 삽입과정
                heap[++idx] = input;
                for(int j = idx; j > 1;){
                    if(heap[j/2] > heap[j]){
                        int tmp = heap[j];
                        heap[j] = heap[j/2];
                        heap[j/2] = tmp;
                        j /= 2;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());

    }
}
