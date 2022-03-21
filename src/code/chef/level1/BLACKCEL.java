//https://www.codechef.com/problems/BLACKCEL

package code.chef.level1;
import java.util.Scanner;

public class BLACKCEL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            int result = n * n / 2;
            System.out.println(result);
        }
    }
}
