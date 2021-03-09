package baekjoon;

import java.util.Scanner;

public class Main10872 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int result = factorial(N);
	System.out.println(result);
}
public static int factorial(int num) {
	if (num ==0) return 1;
	else return num*factorial(num-1);
}
}
