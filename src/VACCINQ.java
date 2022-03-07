//There are N people in the vaccination queue, Chef is standing on the Pth
//position from the front of the queue. It takes X minutes to vaccinate a
//child and Y minutes to vaccinate an elderly person. Assume Chef is
//an elderly person.
//
//You are given a binary array A1,A2,…,AN of length N, where Ai=1 denotes
//there is an elderly person standing on the ith position of the queue,
//Ai=0 denotes there is a child standing on the ith position of the queue.
//You are also given the three integers P,X,Y. Find the number of minutes
//after which Chef's vaccination will be completed.

import java.util.Scanner;

public class VACCINQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i= sc.nextInt(); i>0; i--){
            int lengthQueue = sc.nextInt();
            int positionChef = sc.nextInt();
            int minutesChild = sc.nextInt();
            int minutesElderly = sc.nextInt();
            int result = 0;
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