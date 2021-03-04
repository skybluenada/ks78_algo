package Programmers;

import java.util.*;

public class ArrayKthNum {
	
	 public static int[] solution(int[] array, int[][] commands) {
	      
		   int[] answer = new int [commands.length];
		   StringBuilder sb = new StringBuilder();
		   
		   List<Integer> list = new ArrayList<Integer>();
		   for(int i=0; i<array.length; i++) {
			   list.add(array[i]);
		   }//end for - 리스트에 배열 값 담기
		   
		   List<Integer> alist = null;
		   for(int i=0; i<commands.length; i++) {	   
			   alist = new ArrayList<>(list.subList(commands[i][0]-1, commands[i][1]));
			   Collections.sort(alist);
			   int k = commands[i][2];
			   answer[i] = alist.get(k-1);
			   
			 }
		     System.out.println(Arrays.toString(answer));
	         return answer;
	    }
      
	 // 여기 아래는 테스트용 main
	 public static void main(String[] args) {
		
		 int[] array = {1, 5, 2, 6, 3, 7, 4 }; 
		 int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		 solution(array, commands);
	}

}
