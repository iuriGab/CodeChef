//https://www.codechef.com/problems/CYCLICQD

package code.chef.level1;
import java.util.Scanner;

public class CYCLICQD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a + c == 180 && b + d == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
