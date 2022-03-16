//https://www.codechef.com/problems/FODCHAIN

import java.util.Scanner;

public class FODCHAIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int rounds = sc.nextInt(); rounds > 0; rounds--) {
            int firstLevel = sc.nextInt();
            int kFactor = sc.nextInt();
            int result = 1;

            do {
                firstLevel/=kFactor;
                result++;
            } while (firstLevel > 0);

            System.out.println(result);
        }
    }
}