package level1;//https://www.codechef.com/problems/TYRES

import java.util.Scanner;

public class TYRES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i= sc.nextInt(); i>0; i--){
            int a = sc.nextInt();
            if (a % 4 == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

//    ********************** morano **********************
//    public static void main (string[] args) throws java.lang.exception {
//        scanner sc = new scanner(system.in);
//
//        for (int rounds=sc.nextint();rounds>0 ;rounds-- ) {
//            int remainder = 0;
//            ********* remainder: restante *********
//            int tires = sc.nextint();
//            if(tires%4>0){
//                remainder = tires%4;
//            }
//            ********* operador ternário *********
//            ********* ?: if escondido -------- o "remainder/2" é a
//            primeira condição que é sempre verdadeira e a próxima é
//            false. isso é uma via de regra *********
//            remainder = remainder!=0 ? remainder/2 : remainder;
//            system.out.println(remainder>0? "yes":"no");
//        }
//    }