//https://www.codechef.com/problems/SLOOP

package level1;
import java.util.Scanner;

public class SLOOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for ( ; testCases > 0; testCases--) {
            int mTrip = sc.nextInt();
            int sTrip = sc.nextInt();
            int result = mTrip / sTrip;
            System.out.println(result);
        }
    }
}
