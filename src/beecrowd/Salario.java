//https://www.beecrowd.com.br/judge/pt/runs/code/26871741

package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int number = sc.nextInt();
        int time = sc.nextInt();
        double priceTime = Double.parseDouble(sc.next());

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + df.format(time * priceTime));
    }
}
