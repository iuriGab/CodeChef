//https://www.codechef.com/problems/MASKPOL

package level2;
import java.util.Scanner;

public class MASKPOL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            int aInfectadas = sc.nextInt();
            int naoInfectadas = n-aInfectadas;

            if (aInfectadas <= naoInfectadas){
                System.out.println(aInfectadas);
            } else {
                System.out.println(naoInfectadas);
            }
        }
    }
}