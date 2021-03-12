import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num[] = new int[n];
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			boolean flag = false;
			
			if(num[i] == 1) continue;
			
			for(int j = 2; j <= (num[i]/2); j++) {
				if(num[i] % j == 0) {
					flag = true;
				}
			}
			
			if(flag == false)	cnt++;
			
			flag = true;
		}
		System.out.println(cnt);
	}
}
