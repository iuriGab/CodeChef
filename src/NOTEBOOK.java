//You know that 1 kg of pulp can be used to make 1000
//pages and 1 notebook consists of 100 pages.
//
//Suppose a notebook factory receives N kg of pulp,
//how many notebooks can be made from that?

import java.util.Scanner;

public class NOTEBOOK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int n = sc.nextInt();
            int r = n*10;

            System.out.println(r);
        }
    }
}
