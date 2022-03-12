import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IMDB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int films = sc.nextInt();
            int gbs = sc.nextInt();
            List<Integer> arraygbs  = new ArrayList<Integer>();
            List<Integer> arrayrating  = new ArrayList<Integer>();


            for (int j = 0; j < films; j++) {
                arraygbs.add(j, sc.nextInt());
                arrayrating.add(j, sc.nextInt());
            }

            for (int k = 0; k < arraygbs.size(); k++) {
                if (arraygbs.get(k) > gbs) {
                    arraygbs.set(k,0);
                    arrayrating.set(k,0);
                }
            }

            System.out.println(Collections.max(arrayrating));
        }
    }
}