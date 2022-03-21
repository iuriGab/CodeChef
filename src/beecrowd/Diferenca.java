//https://www.beecrowd.com.br/judge/pt/runs/code/26871459

package beecrowd;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("DIFERENCA = " + ((a * b)-(c * d)));
    }
}
