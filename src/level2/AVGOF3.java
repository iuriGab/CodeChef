//https://www.codechef.com/problems/AVGOF3

package level2;
import java.util.Scanner;

public class AVGOF3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int number = sc.nextInt();
            int a = number-1;
            int c = number+1;

            System.out.println(a + " " + number + " " + c);
        }
    }
}