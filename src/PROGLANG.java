//https://www.codechef.com/problems/PROGLANG

//import java.util.Scanner;
//
//public class PROGLANG {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = sc.nextInt(); i > 0; i--) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int nArray = 4;
//            int[] array = new int[nArray];
//            for (int index1 = 0; index1 < nArray; index1++) {
//                array[index1] = sc.nextInt();
//            }
//            if ((a == array[0] && b == array[1] || a == array[1] && b == array[0]) &&
//                    ((a != array[2] || b != array[3]) || (a != array[3] || b != array[2]))){
//                System.out.println(1);
//            }else{
//                if ((a == array[2] && b == array[3] || a == array[3] && b == array[2]) &&
//                        ((a != array[0] || b != array[1]) || (a != array[1] || b != array[0]))){
//                    System.out.println(2);
//                } else {
//                    System.out.println(0);
//                }
//            }
//        }
//    }
//}

//https://www.codechef.com/problems/PROGLANG

import java.util.Arrays;
import java.util.Scanner;

public class PROGLANG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int[] array = new int[2];
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            Arrays.sort(array);

            int[] array1 = new int[2];
            array1[0] = sc.nextInt();
            array1[1] = sc.nextInt();
            Arrays.sort(array1);

            int[] array2 = new int[2];
            array2[0] = sc.nextInt();
            array2[1] = sc.nextInt();
            Arrays.sort(array2);

            if (Arrays.equals(array, array1)){
                System.out.println(1);
            }else if (Arrays.equals(array, array2)){
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}