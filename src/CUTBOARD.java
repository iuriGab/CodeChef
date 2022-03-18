//https://www.codechef.com/problems/CUTBOARD

import java.util.Scanner;

public class CUTBOARD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int rows = sc.nextInt()-1;
            int column = sc.nextInt()-1;

            System.out.println(rows*column);
        }
    }
}