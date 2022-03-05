//Chef recently realized that he needs a haircut, and went to his
//favorite hair salon. At the salon, he found N customers waiting
//for their haircuts. From his past experience, Chef knows that the
//salon takes M minutes per customer. Only one person can get their
//haircut at a time.
//
//For how many minutes will Chef have to wait before he can get his haircut?

import java.util.Scanner;

public class CHEFBARBER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        int i = 0;
        while (i < times){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a * b;

            System.out.println(result);
            i++;
        }
    }
}
