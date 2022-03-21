package beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        double a = Double.parseDouble(sc.next()) * 3.5;
        double b = Double.parseDouble(sc.next()) * 7.5;
        System.out.println("MEDIA = " + df.format((a + b) / 11));
    }
}
