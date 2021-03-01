package _2941_croatiaAlphabet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : cro) {
            if (input.contains(s)) {
                input = input.replaceAll(s, "*");
            }
        }
        System.out.println(input.length());
    }
}
