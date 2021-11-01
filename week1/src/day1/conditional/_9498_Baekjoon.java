package day1.conditional;

import java.util.Scanner;

public class _9498_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt() / 10;

        switch (score) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}

/*
package day1.conditional;

import java.util.Scanner;

public class _9498_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 90) {
            System.out.println("A");
        }else if (a >= 80) {
            System.out.println("B");
        }else if (a >= 70) {
            System.out.println("C");
        }else if (a >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
*/