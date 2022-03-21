//https://www.codechef.com/problems/CHFRICH

package code.chef.level1;
import java.util.Scanner;

public class CHFRICH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t=sc.nextInt(); t>0; t--){
            int[] params = new int[3];
            for (int i=0; i<3; i++) {
                params[i] = sc.nextInt();
            }
            System.out.println((params[1]-params[0]) / params[2]);
        }
    }
}
