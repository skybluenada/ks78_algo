
import java.util.Scanner;

public class Test_10870 {
	public static int f(int x) {
		if(x <= 1) {
			return 1;
		}else {
			return f(x-1)+f(x-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n-1));
	}
}
