package day1.conditional;

import java.util.Scanner;

public class _1330_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        }
        if (a < b) {
            System.out.println("<");
        }
        if (a == b) {
            System.out.println("==");
        }
    }
}

/*
package day1.conditional;

import java.util.Scanner;

public class _1330_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        }else if (a < b) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}
*/