package diskController;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    static int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        int count = 0;
        int end = 0;
        int jobsIdx = 0;
        int answer = 0;

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                pq.add(jobs[jobsIdx++]);
            }
            if (pq.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end-temp[0];
                end += temp[1];
                count++;
            }
        }
//        System.out.println(answer/jobs.length);
        return answer/jobs.length;
    }

    public static void main(String[] args) {
        solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
    }
}
