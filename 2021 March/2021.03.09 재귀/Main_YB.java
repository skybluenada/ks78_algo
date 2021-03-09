package baekjoon;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;



public class Main10872 {
public static void main(String[] args) /*throws IOException*/ {
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int result = factorial(N);
	System.out.println(result);
	//br.close();
}
public static int factorial(int num) {
	if (num ==1) return 1;
	else return num*factorial(num-1);
}
}
