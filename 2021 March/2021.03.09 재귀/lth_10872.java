package backjun_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{   
   public static void main(String[] args) throws Exception {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());   
      
      int result = factorial(n);
      System.out.println(result);
      
   }
   
   public static int factorial(int n) {
      
      if(n <= 1) {
         return 1;
      } else {
         return n * factorial(n-1);
      }
   }
}
