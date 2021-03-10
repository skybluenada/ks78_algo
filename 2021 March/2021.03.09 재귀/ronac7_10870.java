import java.util.Scanner;

public class Main {

    static int fibo(int x) {
        if (x<2) return x;

        return fibo(x-2) +fibo(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = fibo(N);
        System.out.println(result);
    }
}
