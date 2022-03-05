//Some time ago, Chef bought X stocks at the cost of Rs. Y each.
//Today, Chef is going to sell all these X stocks at Rs. Z each.
//What is Chef's total profit after he sells them?
//
//Chef's profit equals the total amount he received by selling the stocks,
//minus the total amount he spent buying them.

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
