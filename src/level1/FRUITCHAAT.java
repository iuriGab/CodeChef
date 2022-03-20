//https://www.codechef.com/problems/FRUITCHAAT

package level1;
import java.util.Scanner;

public class FRUITCHAAT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int bananas = sc.nextInt();
            int apples = sc.nextInt();

            if (apples >= bananas/2){
                System.out.println(bananas /= 2);
            } else {
                System.out.println(apples);
            }
        }
    }
}
