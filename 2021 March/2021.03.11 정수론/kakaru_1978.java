import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt=0;
        while (st.hasMoreTokens()){
            boolean chk = true;
            int x = Integer.parseInt(st.nextToken());
            if(x == 1){
                continue;
            }
            for(int i = 2; i <= x/2; i++){
                if(x % i == 0)
                    chk = false;
            }
            if(chk == true){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
