package level1;//https://www.codechef.com/problems/COCONUT

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
