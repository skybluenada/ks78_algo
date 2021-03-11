import java.util.Scanner;

public class Test_1978 {
	public static void main(String[] args) {
		// 소수 : 1과 자기 자신으로만 나누어 지는 수(약수 2개)
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] num = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			
			for (int j = 2; j <= num[i]; j++) {
				if (num[i] % j == 0) {
					if(num[i]==j) {
						count++;
					}else {
						break;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
