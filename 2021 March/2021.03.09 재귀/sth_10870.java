import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
				
		System.out.println(Fibonacci(N));
	}
	
	static long Fibonacci(int num) {
		if(num == 0) {
			return 0;
		}else if(num == 1) {
			return 1;
		}else {
			return Fibonacci(num-1) + Fibonacci(num-2);
		}
	}
}
