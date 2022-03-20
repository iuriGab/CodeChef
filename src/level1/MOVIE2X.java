//https://www.codechef.com/problems/MOVIE2X

package level1;
import java.util.Scanner;

public class MOVIE2X {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int allMovie = sc.nextInt();
        int firstsMinutes = sc.nextInt();

        firstsMinutes /= 2;
        System.out.println(allMovie - firstsMinutes);
    }
}
