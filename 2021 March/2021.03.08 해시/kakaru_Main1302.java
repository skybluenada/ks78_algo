import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(int i = 0; i < N; i++){
			String str = br.readLine();
			if(!map.containsKey(str)) {
				map.put(str, 1);
			}
			else {
				map.put(str, map.get(str)+1);				
			}
		}
//		Object [] mapkey = map.keySet().toArray();
//		Arrays.sort(mapkey);
		String ans = "";
		int max = 0;
		for(String key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				ans = key;					
			}
		}
		System.out.println(ans);
	}
}
