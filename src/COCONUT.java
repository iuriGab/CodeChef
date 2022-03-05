//Chefland has 2 different types of coconut, type A and type B.
//Type A contains only xa milliliters of coconut water and type B
//contains only xb grams of coconut pulp. Chef's nutritionist has
//advised him to consume Xa milliliters of coconut water and Xb
//grams of coconut pulp every week in the summer. Find the total
//number of coconuts (type A + type B) that Chef should buy each
//week to keep himself active in the hot weather.

import java.util.Scanner;

public class COCONUT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int i = 0;
        while(i<t){
            int axmili = sc.nextInt();
            int bxgrams = sc.nextInt();
            int aXmili = sc.nextInt();
            int bXgrams = sc.nextInt();

            int coconuts = (aXmili / axmili) + (bXgrams / bxgrams);

            System.out.println(coconuts);

            i++;
        }
    }
}
