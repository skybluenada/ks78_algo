import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
    
    //문자열 배열로 변환
		for(int i = 0; i<numbers.length; i++) {
			num[i] = Integer.toString(numbers[i]);
		}
		
    //문자열 배열 정렬  
		Arrays.sort(num, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
      
		if(num[0].startsWith("0")) {  // 0으로 시작할 경우
			answer += "0";
		} else {
			for(int j=0; j<num.length; j++) {
				answer += num[j];
			}
		}       
        return answer;
    }
}
