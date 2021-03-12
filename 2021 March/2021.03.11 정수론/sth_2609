import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int gcd = 0;
		
		for(int i = Math.max(n1, n2); i >= 1; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
				break;
			}
		}
		
		System.out.println(gcd);
		System.out.println(n1 * n2 / gcd);
		
	}
}
