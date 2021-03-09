import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
				
		System.out.println(fatorial(N));
	}
	
	static long fatorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}else {
			return num * fatorial(num - 1);
		}
	}
}
