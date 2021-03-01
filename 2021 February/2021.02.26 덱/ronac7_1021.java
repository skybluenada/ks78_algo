package _1021_circulationQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i=1; i <= n; i++) {
            list.add(i);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            int num = Integer.parseInt(st.nextToken());
            while (!flag) {
                if (list.get(0) == num) {
                    list.pollFirst();
                    flag = true;
                }
                else {
                    if ( list.indexOf(num) <= list.size()/2 ) {
                        list.addLast(list.pollFirst());
                    }
                    else {
                        list.addFirst(list.pollLast());
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
