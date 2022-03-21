//https://www.beecrowd.com.br/judge/pt/runs/code/26872233

package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String name = sc.next();
        double salary = Double.parseDouble(sc.next());
        double totalSells = Double.parseDouble(sc.next());

        System.out.println("TOTAL = R$ " + df.format((totalSells * 0.15) + salary));
    }
}
