//Chef aims to be the richest person in Chefland by his
//new restaurant franchise. Currently, his assets are
//worth A billion dollars and have no liabilities. He aims
//to increase his assets by X billion dollars per year.
//
//Also, all the richest people in Chefland are not planning
//to grow and maintain their current worth.
//
//To be the richest person in Chefland, he needs to be worth
//at least B billion dollars. How many years will it take
//Chef to reach his goal if his value increases by X billion
//dollars each year?

import java.util.Scanner;

public class CHFRICH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t=sc.nextInt(); t>0; t--){
            int[] params = new int[3];
            for (int i=0; i<3; i++) {
                params[i] = sc.nextInt();
            }
            System.out.println((params[1]-params[0]) / params[2]);
        }
    }
}
