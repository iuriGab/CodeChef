//https://www.beecrowd.com.br/judge/pt/runs/code/26912868

package beecrowd;

import java.math.BigInteger;
import java.util.Scanner;

public class Digitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            BigInteger number, result;
            number = new BigInteger(sc.next());
            int exponent = sc.nextInt();
            result = number.pow(exponent);

            String split = result.toString();

            System.out.println(split.length());
        }
    }
}