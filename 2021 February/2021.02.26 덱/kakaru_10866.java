import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> dequeue = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (cnt < N) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int input;
            switch (str) {
                case "push_front":
                    input = Integer.parseInt(st.nextToken());
                    dequeue.addFirst(input);
                    cnt++;
                    break;
                case "push_back":
                    input = Integer.parseInt(st.nextToken());
                    dequeue.addLast(input);
                    cnt++;
                    break;
                case "pop_front":
                    if (dequeue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(dequeue.getFirst()).append("\n");
                        dequeue.removeFirst();
                    }
                    cnt++;
                    break;
                case "pop_back":
                    if (dequeue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(dequeue.getLast()).append("\n");
                        dequeue.removeLast();
                    }
                    cnt++;
                    break;
                case "size":
                    sb.append(dequeue.size()).append("\n");
                    cnt++;
                    break;
                case "empty":
                    if (dequeue.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    cnt++;
                    break;
                case "front":
                    if (dequeue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(dequeue.getFirst()).append("\n");
                    }
                    cnt++;
                    break;
                case "back":
                    if (dequeue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(dequeue.getLast()).append("\n");
                    }
                    cnt++;
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
