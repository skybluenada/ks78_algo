package _10799_ironRod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int a = 0;
        int b = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                a+=1;
            } else if (input.charAt(i) == ')' && input.charAt(i-1) == '(') {
                a--;
                b+=a;
            } else {
                a--;
                b+=1;
            }
        }
        System.out.println(b);
    }
}
