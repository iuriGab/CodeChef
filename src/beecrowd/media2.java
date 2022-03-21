//https://www.beecrowd.com.br/judge/pt/runs/code/26871211

package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class media2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double a = Double.parseDouble(sc.next()) * 2;
        double b = Double.parseDouble(sc.next()) * 3;
        double c = Double.parseDouble(sc.next()) * 5;
        System.out.println("MEDIA = " + df.format((a+b+c) / 10));
    }
}