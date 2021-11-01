package day1.loop;

import java.util.Scanner;

public class _11720_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String nums = sc.next();
        int total = 0;

        for (int i=0; i<n; i++) {
            total += nums.charAt(i)-'0';
        }

        System.out.println(total);
    }
}
