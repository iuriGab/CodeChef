//https://www.codechef.com/problems/VACCINQ

package code.chef.level2;
import java.util.Scanner;

public class VACCINQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i= sc.nextInt(); i>0; i--){

            int result = 0;

            int lengthQueue = sc.nextInt();
            int positionChef = sc.nextInt();
            int minutesChild = sc.nextInt();
            int minutesElderly = sc.nextInt();

            int[] array = new int[lengthQueue];
            for (int index = 0; index < lengthQueue; index++) {
                array[index] = sc.nextInt();
            }

            for (int index2 = 0; index2 < positionChef; index2++) {
                if (array[index2] == 0){
                    result += minutesChild;
                } else {
                    result += minutesElderly;
                }
            }

            System.out.println(result);
        }
    }
}