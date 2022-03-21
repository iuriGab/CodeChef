//https://www.codechef.com/problems/ICL1902

package code.chef.level2;
import java.util.Scanner;

public class ICL1902 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int rounds = sc.nextInt(); rounds > 0; rounds--) {
            int nCircles = sc.nextInt();
            int result = 0;

            while (nCircles > 0){
                int squareRoot = (int) Math.sqrt(nCircles);
                nCircles -= Math.pow(squareRoot, 2);
                result++;
            }

            System.out.println(result);
        }
    }
}