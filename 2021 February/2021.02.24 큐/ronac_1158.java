import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String str = st.nextToken();

        int nums = Integer.parseInt(str);
        int jumps = Integer.parseInt(st.nextToken());

        for ( int i = 0; i < nums; i++) {
            deque.add(i+1);
        }

        while (true) {
            if (deque.size() == 1) {
                sb.append(deque.getFirst());
                break;
            } else {
                for (int i = 0; i < jumps-1; i++) {
                    deque.addLast(deque.removeFirst());
                }
                sb.append(deque.removeFirst()).append(", ");
            }
        }
        System.out.println("<"+sb.toString()+">");
    }
}