import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
       int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.add(s);
        }
        while(pq.size() >= 2 && pq.peek() < K){
            int x,y;
            x = pq.peek();
            pq.poll();
            y = pq.peek() * 2 + x;
            pq.poll();
            pq.add(y);
            answer++;
        }
        if(pq.peek() < K){
            return -1;
        }
        return answer;
    }
}
