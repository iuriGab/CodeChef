package level1;//https://www.codechef.com/problems/CHFPROFIT

import java.util.Scanner;

public class CHFPROFIT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        int i = 0;
        while (i<times) {
            int xStocks = sc.nextInt();
            int yEach = sc.nextInt();
            int zPriceSelled = sc.nextInt();

            int spend = xStocks * yEach;
            int sell = xStocks * zPriceSelled;
            int result = sell - spend;

            System.out.println(result);
            i++;
        }
    }
}
