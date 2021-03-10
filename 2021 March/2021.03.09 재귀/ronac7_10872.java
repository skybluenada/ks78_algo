import java.util.Scanner;

public class Main {
    static int result = 1;
    static int factorial(int x) {
        if (x<2) {
            System.out.println(result);
            return result;
        }
        result *= x;
        factorial(x-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        factorial(N);
    }
}
