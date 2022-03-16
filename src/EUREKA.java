//https://www.codechef.com/problems/EUREKA

import java.util.Scanner;

public class EUREKA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int rounds = sc.nextInt(); rounds > 0; rounds--) {
            int number = sc.nextInt();
            double r1 = 0.143 * number;
            System.out.println(Math.round(Math.pow(r1, number)));
        }
    }
}