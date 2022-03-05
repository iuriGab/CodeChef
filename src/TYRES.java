//Chef opened a company which manufactures cars and bikes. Each
//car requires 4 tyres while each bike requires 2 tyres. Chef has
//a total of N tyres (N is even). He wants to manufacture maximum
//number of cars from these tyres and then manufacture bikes from
//the remaining tyres.
//
//Chef's friend went to Chef to purchase a bike. If Chef's company
//has manufactured even a single bike then Chef's friend will be
//able to purchase it.
//
//Determine whether he will be able to purchase the bike or not.

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

//    ********************** Morano **********************
//    public static void main (String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);

//        for (int rounds=sc.nextInt();rounds>0 ;rounds-- ) {
//            int remainder = 0;
//            ********* remainder: restante *********
//            int tires = sc.nextInt();
//            if(tires%4>0){
//                remainder = tires%4;
//            }
//            ********* operador ternário *********
//            ********* ?: if escondido -------- o "remainder/2" é a
//            primeira condição que é sempre verdadeira e a próxima é
//            false. Isso é uma via de regra *********
//            remainder = remainder!=0 ? remainder/2 : remainder;
//            System.out.println(remainder>0? "YES":"NO");
//        }
//    }