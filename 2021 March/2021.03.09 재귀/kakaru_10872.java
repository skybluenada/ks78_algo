import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int num){
        if(num==1 || num == 0){
            return 1;
        }
        return num * fac(num-1);
    }
}
