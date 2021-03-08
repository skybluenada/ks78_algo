package day0204;
import java.io.*;
import java.util.*;

public class Test_1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> best = new TreeMap<String, Integer>();
    
		int n = Integer.parseInt(br.readLine());
    
		for (int i = 0; i < n; i++) {
			String book = br.readLine();
			if (best.containsKey(book)) {
				best.put(book, best.get(book) + 1);
			} else {
				best.put(book, 1);
			}
		}
		
		String title = "";
		int max = 0;
    
		for (String key : best.keySet()) {
			if (best.get(key) > max) {
				max = best.get(key);
				title = key;
			}
		}
		System.out.println(title);
	}
}
