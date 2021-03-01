package _1316_groupWordChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;

        for ( int j=0; j<n; j++) {
            StringBuilder checker = new StringBuilder("*");
            String input = br.readLine();
            for (int i=0; i<input.length()-1; i++) {
                if (input.charAt(i) != input.charAt(i + 1)) {
                    String tmp = Character.toString(input.charAt(i));

                    if (checker.toString().contains(tmp)) {
                        count--;
                        break;
                    }
                    else {
                        checker.append(tmp);
                    }
                }
                if ( i == input.length()-2 && checker.toString().contains(input.substring(input.length()-1))) {
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
