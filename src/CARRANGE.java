//https://www.codechef.com/problems/CARRANGE

import java.util.Scanner;

public class CARRANGE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            int p = sc.nextInt();
            int m = sc.nextInt();
            int v = sc.nextInt();

            if (p>1){
                m -= p-1;
            }
            System.out.println(m*v);
        }
    }
}
