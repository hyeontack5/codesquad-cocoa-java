package day1.gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("시작 단과 끝단을 입력해주세요.");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i=start; i<=end; i++) {
            System.out.println(i + "단 입니다.");
            for (int j=1; j<=9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
