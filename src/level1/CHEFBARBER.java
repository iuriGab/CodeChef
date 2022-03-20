package level1;//https://www.codechef.com/problems/CHEFBARBER

import java.util.Scanner;

public class CHEFBARBER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        int i = 0;
        while (i < tests){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a * b;

            System.out.println(result);
            i++;
        }
    }
}