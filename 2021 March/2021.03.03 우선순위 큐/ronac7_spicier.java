import java.util.PriorityQueue;

public class Solution {

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int answer = 0;
        for (int i=0; i<scoville.length; i++) {
            heap.add(scoville[i]);
        }
        while (heap.peek() < K) {
            if (heap.size() == 1) return -1;
            int min = heap.poll();
            int smin = heap.poll();
            heap.offer(min+smin*2);
            answer++;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
    }
}
