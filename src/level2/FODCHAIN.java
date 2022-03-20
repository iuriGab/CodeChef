//https://www.codechef.com/problems/FODCHAIN

package level2;
import java.util.Scanner;

public class FODCHAIN {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
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
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}