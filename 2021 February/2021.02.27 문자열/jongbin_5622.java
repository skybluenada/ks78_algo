
import java.util.Scanner;

public class Test_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		char[] a = input.toCharArray();

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'A' || a[i] == 'B' || a[i] == 'C') {
				count += 3;	//2
			} else if (a[i] == 'D' || a[i] == 'E' || a[i] == 'F') {
				count += 4;	//3
			} else if (a[i] == 'G' || a[i] == 'H' || a[i] == 'I') {
				count += 5;	//4
			} else if (a[i] == 'J' || a[i] == 'K' || a[i] == 'L') {
				count += 6; //5
			} else if (a[i] == 'M' || a[i] == 'N' || a[i] == 'O') {
				count += 7; //6
			} else if (a[i] == 'P' || a[i] == 'Q' || a[i] == 'R' || a[i] == 'S') {
				count += 8; //7
			} else if (a[i] == 'T' || a[i] == 'U' || a[i] == 'V') {
				count += 9; //8
			} else if (a[i] == 'W' || a[i] == 'X' || a[i] == 'Y' || a[i] == 'Z') {
				count += 10;//9
			}

		}
		
		System.out.println(count);

	}
}
