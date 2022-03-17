//https://www.codechef.com/problems/TRAVELPS

import java.util.Scanner;

public class TRAVELPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int rounds = sc.nextInt(); rounds > 0; rounds--) {
            int n = sc.nextInt();
            int aMinutes = sc.nextInt();
            int bMinutes = sc.nextInt();
            int result = 0;

            String string = sc.next();
            char[] split = string.toCharArray();

            for (int j = 0; j < n; j++) {
                int value = Character.getNumericValue(split[j]);
                if (value == 0){
                    result+=aMinutes;
                }
                if (value == 1){
                    result+=bMinutes;
                }
            }
            System.out.println(result);
        }
    }
}
