import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return fibo(num-2) + fibo(num-1);
    }
}
