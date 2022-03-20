//https://www.codechef.com/problems/EQCARDGAME

package level2;
import java.util.Scanner;

public class EQCARDGAME {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int players = sc.nextInt();
                System.out.println(52 % players);
        }
    }
}