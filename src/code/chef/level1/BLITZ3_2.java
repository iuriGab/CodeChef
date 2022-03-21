package code.chef.level1;//https://www.codechef.com/problems/BLITZ3_2

import java.util.Scanner;

public class BLITZ3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int r1 = 2 * (180 + n);
            int r2 = a + b;
            int r3 = r1 - r2;

            System.out.println(r3);
        }
    }
}