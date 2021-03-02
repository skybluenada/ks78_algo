package baekjoon;

import java.util.Scanner;

public class HH {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = 9;
		int[] arr = new int[N];
		for(int i =0; i<9;i++) {
			int input = sc.nextInt();
			arr[i] = input;					
		}
		int max = arr[0];
		int A = 0;
		for(int i = 0;i<N;i++) {
			if(arr[i]>max) {
				max=arr[i];
				A=i;
			}
			
		}
		
		System.out.println( max);
		System.out.println(A+1);
			
	}

}
