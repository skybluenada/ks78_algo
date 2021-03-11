import java.util.Scanner;

public class Test_2609 {
	public static int ea(int x, int y) {
		if (x>y) {
			int result = x%y;
			if(result == 0) {
				return y;
			}else {
				return ea(y, result);
			}
		}else if(y>x) {
			int result = y%x;
			if(result == 0) {
				return x;
			}else {
				return ea(x, result);
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		// 최대공약수
		//유클리드 호제법
		// (n1>n2) n1%n2 = result1, n2/result1 = result2,
		//.... result(n-1)/result(n) = 0 일때 result(n)이 최대공약수
		int gcd = ea(n1, n2);
		
		// 최소공배수
		// (n1*n2)/(최대공약수)
		int lcm = (n1*n2)/gcd;
				
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
}
