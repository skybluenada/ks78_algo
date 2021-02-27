import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++){
            dq.add(i);
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        while(st2.hasMoreTokens()){
            int num = Integer.parseInt(st2.nextToken());
            while(true){

                if(num == dq.getFirst()){
                    dq.pollFirst();
                    break;
                }
                else if(num == dq.getLast()){
                    dq.pollLast();
                    break;
                }
                else if(num - dq.getFirst() < dq.getLast() - num){
                    dq.addLast(dq.pollFirst());
                    cnt++;
                }
                else if(num - dq.getFirst() > dq.getLast() - num){
                    dq.addFirst(dq.pollLast());
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
