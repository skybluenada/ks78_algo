package _2908_constant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());

        System.out.println(Math.max(num1, num2));

    }
}
