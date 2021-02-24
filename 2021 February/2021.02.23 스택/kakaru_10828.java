import java.util.ArrayList;
import java.util.Scanner;

public class Main_10828 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> stack = new ArrayList<Integer>();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
//		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(cnt < N) {
			String str = sc.next();
//			String str = br.readLine();
			switch(str) {
				case "push":
					int input = sc.nextInt();
//					int input = Integer.parseInt(br.readLine());
					stack.add(input);
					cnt++;
					break;
				case "top":
					if(stack.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(stack.get(stack.size()-1)).append("\n");	
					}
					cnt++;
					break;
				case "pop":
					if(stack.isEmpty()) {
						sb.append("-1\n");						
					}
					else {
						sb.append(stack.get(stack.size()-1)).append("\n");
						stack.remove(stack.size()-1);	
					}
					cnt++;
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					cnt++;
					break;
				case "empty":
					if(stack.isEmpty()) {
						sb.append("1\n");
					}
					else {						
						sb.append("0\n");
					}
					cnt++;
					break;		
			}
		}
		System.out.println(sb.toString());
		
	}
}
