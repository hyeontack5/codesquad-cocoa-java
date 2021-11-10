package day1.conditional;

import java.util.Scanner;

public class _14681_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>0 && y>0) {   // x와 y가 양수인 경우
            System.out.println(1);  // 제1사분면
        }
        if (x<0 && y>0) {   // x가 음수, y가 양수인 경우
            System.out.println(2);  // 제2사분면
        }
        if (x<0 && y<0) {   // x가 음수, y가 음수인 경우
            System.out.println(3);  // 제3사분면
        }
        if (x>0 && y<0){  // x가 양수, y가 음수인 경우
            System.out.println(4);  // 제4사분면
        }
    }
}

/*
package day1.conditional;

import java.util.Scanner;

public class _14681_Baekjoon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>0 && y>0) {
            System.out.println(1);
        }else if (x<0 && y>0) {
            System.out.println(2);
        }else if (x<0 && y<0) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
*/
