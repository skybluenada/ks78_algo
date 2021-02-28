package _10866_dequeue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static Deque<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    static void push_front(int x) {
        deque.addFirst(x);
    }

    static void push_back(int x) {
        deque.addLast(x);
    }

    static void pop_front() {
        if (deque.isEmpty()) {
            sb.append(-1 + "\n");
        } else {
            sb.append(deque.poll()).append("\n");
        }
    }

    static void pop_back() {
        if (deque.isEmpty()) {
            sb.append(-1 + "\n");
        } else {
            sb.append(deque.pollLast()).append("\n");
        }
    }

    static void size() {
        sb.append(deque.size()).append("\n");
    }

    static void empty() {
        if (deque.isEmpty()) {
            sb.append(1 + "\n");
        } else {
            sb.append(0 + "\n");
        }
    }

    static void front() {
        if (deque.isEmpty()) {
            sb.append(-1 + "\n");
        } else {
            sb.append(deque.peekFirst()).append("\n");
        }
    }

    static void back() {
        if (deque.isEmpty()) {
            sb.append(-1 + "\n");
        } else {
            sb.append(deque.peekLast()).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lines = Integer.parseInt(st.nextToken());

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }
}
