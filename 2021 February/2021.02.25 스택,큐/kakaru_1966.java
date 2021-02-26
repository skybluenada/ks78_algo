import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1966 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st2.nextToken());
            int M = Integer.parseInt(st2.nextToken());
            Queue<int[]> queue = new LinkedList<int[]>();
            //int N = sc.nextInt();
            //int M = sc.nextInt();
            for(int j = 0; j < N; j++) {
                int x = sc.nextInt();
                if(j == M) {
                    queue.add(new int[] {x,1});
                    arr.add(x);
                }
                else {
                    queue.add(new int[] {x,0});
                    arr.add(x);
                }
            }
            Collections.sort(arr);
            int cnt = 0;
            while(!queue.isEmpty()) {
                if(arr.get(arr.size()-1)==queue.element()[0] && queue.element()[1] == 1) {
                    arr.remove(arr.size()-1);
                    queue.poll();
                    cnt++;
                    break;
                }
                else if(arr.get(arr.size()-1)==queue.element()[0]) {
                    arr.remove(arr.size()-1);
                    queue.poll();
                    cnt++;
                }
                else {
                    queue.add(queue.peek());
                    queue.poll();
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb.toString());
    }
}
