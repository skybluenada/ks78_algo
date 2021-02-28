import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cases = Integer.parseInt(br.readLine());

        while (cases-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<Integer> unOrdered = new LinkedList<>();
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                unOrdered.add(Integer.parseInt(str[i]));
                }
            Queue<Integer> que = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                que.add(i);
            }

            int count = 0;
            if (que.size() == 1) {
                count++;
                sb.append(count).append('\n');
            } else {
                while (!que.isEmpty()) {
                    boolean isMax = true;
                    for (int j=1; j<que.size();j++) {
                        if (unOrdered.get(0) < unOrdered.get(j)) {
                            isMax = false;
                            break;
                        } else {
                            isMax = true;
                        }
                    }
                    if (isMax) {
                        count++;
                        unOrdered.poll();
                        int chk = que.poll();
                        if ( chk == m ) {
                            sb.append(count).append('\n');
                            break;
                        }
                    } else {
                        unOrdered.add(unOrdered.poll());
                        que.add(que.poll());
                    }
                }
            }
        } // end case
        System.out.println(sb);
    }
}
