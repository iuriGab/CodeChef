//https://www.beecrowd.com.br/judge/pt/runs/code/26868057

package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = Double.parseDouble(sc.next());
        double result = n * (raio * raio);
        System.out.println("A=" + df.format(result));
    }
}
