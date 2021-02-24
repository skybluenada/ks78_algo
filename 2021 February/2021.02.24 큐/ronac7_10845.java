import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> nums = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static void push(int num) {
        nums.add(num);
    }

    static void pop() {
        if (nums.size() == 0) {
            sb.append(-1 + "\n");
        } else {
            sb.append(nums.get(0)).append("\n");
            nums.remove(0);
        }
    }

    static void size() {
        sb.append(nums.size()).append("\n");
    }

    static void empty() {
        if (nums.size() == 0) {
            sb.append(1 + "\n");
        } else {
            sb.append(0 + "\n");
        }
    }

    static void front() {
        if (nums.size() == 0) {
            sb.append(-1 + "\n");
        } else {
            sb.append(nums.get(0)).append(" \n");
        }
    }

    static void back() {
        if (nums.size() == 0) {
            sb.append(-1 + "\n");
        } else {
            sb.append(nums.get(nums.size()-1)).append(" \n");
        }
    }

    public static void main(String[] args) throws IOException {

        int lines = Integer.parseInt(br.readLine());


        for (int i=0; i<lines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            if (str.startsWith("push")) {
                push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                pop();
            } else if (str.equals("size")) {
                size();
            } else if (str.equals("empty")) {
                empty();
            } else if (str.equals("front")) {
                front();
            } else if (str.equals("back")) {
                back();
            }
        }
        System.out.println(sb.toString());
    }
}
