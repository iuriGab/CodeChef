//https://www.codechef.com/problems/CHEFBARBER

import java.util.Scanner;

public class CHEFBARBER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        int i = 0;
        while (i < times){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a * b;

            System.out.println(result);
            i++;
        }
    }
}