//https://www.codechef.com/problems/DOLL

package level1;
import java.util.Scanner;

public class DOLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tests = sc.nextInt(); tests > 0; tests--) {
            int totalNumbers = sc.nextInt();
            int numberLimit = sc.nextInt();
            int result = 0;
            for (int i = 0; i < totalNumbers; i++) {
                int number = sc.nextInt();
                if (number > numberLimit){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}