//A city has been infected by a contagious virus.

//In a survey, it was found that A out of the N people
//living in the city are currently infected. It has
//been observed that the only way for a person to get
//infected is if he comes in contact with an already
//infected person, and both of them are NOT wearing a mask.

//The mayor of the city wants to make a new Mask Policy
//and find out the minimum number of people that will be
//required to wear a mask to avoid the further spread
//of the virus. Help the mayor in finding this number.

//Note: The only aim of the mayor is to stop virus
//spread, not to mask every infected person.

import java.util.Scanner;

public class MASKPOL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            int aInfectadas = sc.nextInt();
            int naoInfectadas = n-aInfectadas;

            if (aInfectadas <= naoInfectadas){
                System.out.println(aInfectadas);
            } else {
                System.out.println(naoInfectadas);
            }
        }
    }
}