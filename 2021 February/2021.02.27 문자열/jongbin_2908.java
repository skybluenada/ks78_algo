
import java.io.*;

public class Test_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ab = br.readLine().split(" ");

		String[] a = ab[0].split("");
		String[] b = ab[1].split("");

		String A = a[2] + a[1] + a[0];
		String B = b[2] + b[1] + b[0];

		int resultA = Integer.parseInt(A);
		int resultB = Integer.parseInt(B);

		if (resultA > resultB) {
			System.out.println(resultA);
		} else if (resultA < resultB) {
			System.out.println(resultB);
		}

	}
}
