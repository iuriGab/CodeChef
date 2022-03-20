//https://www.codechef.com/problems/CHEFSTLT

import java.util.Scanner;

public class CHEFSTLT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            String firstSt = sc.next();
            String secondSt = sc.next();
            char[] char1 = firstSt.toCharArray();
            char[] char2 = secondSt.toCharArray();
            int minimo = 0;
            int maximo = 0;

            for (int j = 0; j < char1.length; j++) {
                if (char1[j] == '?' || char2[j] == '?') {
                    maximo++;
                }else if (char1[j] != char2[j]){
                    minimo++;
                    maximo++;
                }
            }
            System.out.println(minimo + " " + maximo);
        }
    }
}
