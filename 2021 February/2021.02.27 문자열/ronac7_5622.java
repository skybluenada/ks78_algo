package _5622_dial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int time = 0;


        for ( int i=0; i<str.length(); i++ ) {
            if (str.charAt(i) > 86) {
                time += 10;
            }
            else if (str.charAt(i) > 83) {
                time += 9;
            }
            else if (str.charAt(i) > 79) {
                time += 8;
            }
            else if (str.charAt(i) > 76) {
                time += 7;
            }
            else if (str.charAt(i) > 73) {
                time += 6;
            }
            else if (str.charAt(i) > 70) {
                time += 5;
            }
            else if (str.charAt(i) > 67) {
                time += 4;
            }
            else if (str.charAt(i) > 64) {
                time += 3;
            }
        }
        System.out.println(time);
    }
}
