import java.io.*;

public class Test_10799 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split("");
		int pipe = 0;
		int result = 0;

		for (int i = 0; i < st.length; i++) {
			if (st[i].equals("(")) {
				pipe++;
			}else {
				pipe--;
				if (st[i - 1].equals("(")) {
					result += pipe;
				}else {
					result++;
				}
			}

		} // for end

		System.out.println(result);

	}

}
