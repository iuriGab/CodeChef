//https://www.codechef.com/problems/COVID_19

import java.util.Scanner;

public class COVID19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int rounds = sc.nextInt(); rounds > 0; rounds--) {
            int numberOfRows = sc.nextInt();
            int seats = sc.nextInt();
            int result = 0;
            if (numberOfRows%2==0 && seats%2==0){
                result = (numberOfRows/2) * (seats/2);
            } else
            if (numberOfRows%2!=0 && seats%2==0){
                result = ((numberOfRows/2)+1) * (seats/2);
            } else
            if (numberOfRows%2==0 && seats%2!=0){
                result = (numberOfRows/2) * ((seats/2)+1);
            } else {
                result = ((numberOfRows/2)+1) * ((seats/2)+1);
            }
            System.out.println(result);
        }
    }
}