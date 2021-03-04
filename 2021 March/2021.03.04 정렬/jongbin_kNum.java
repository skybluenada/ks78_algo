class Solution {
    public int[] solution(int[] array, int[][] commands) {
      	int i = 0, j = 0, k = 0;
		int[] answer = new int[commands.length];
		for (int l = 0; l < commands.length; l++) {
			i = commands[l][0];
			j = commands[l][1];
			k = commands[l][2];
			int[] result = new int[j - i + 1];
			for(int m = 0; m < result.length; m++) {
				result[m] = array[i-1];
				i++;
			}
      // bubble sort
			boolean loop = true;
            while(loop){
                loop = false;
                for(int m = 1; m < result.length; m++){
                    if(result[m-1] > result[m]){
                        int temp = result[m-1];
                        result[m-1] = result[m];
                        result[m] = temp;
                        loop = true;
                    }
                }
            }
			answer[l] = result[k-1];
		}
		return answer;
	}
}
