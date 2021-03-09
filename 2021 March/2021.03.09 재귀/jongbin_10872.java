
import java.util.Scanner;

public class Test_10872 {
	public static int fac(int x) {
		if(x==0) {
			return 1;
		}else {
			return x*fac(x-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n));
	}
}
