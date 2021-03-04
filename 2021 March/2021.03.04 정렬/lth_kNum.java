
import java.util.Arrays;

public class Solution {
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int arr_count = 0;
		int count = 0;

		for (int i = 0; i < commands.length; i++) {
			// 각각 값을 넣어줄 배열을 만든다.
			int[] arr = new int[(commands[i][1] - commands[i][0]) + 1];

			// commands의 인덱스에 맞게 값을 넣어준다.
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr[arr_count] = array[j];
				arr_count++;
			}

			// 정렬 후 answer 배열에 값을 넣어준다.
			Arrays.sort(arr);

			answer[count] = arr[commands[i][2] - 1];
			count++;
			arr_count = 0;
		}

		return answer;
	}
	
}
