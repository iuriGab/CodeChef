package code.chef.level2;//https://www.codechef.com/problems/IMDB

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IMDB {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int numberOfFilms = sc.nextInt();
            int spaceDisk = sc.nextInt();

            List<Integer> arrayspace = new ArrayList<>();
            List<Integer> arrayrating = new ArrayList<>();

            for (int j = 0; j < numberOfFilms; j++) {
                arrayspace.add(sc.nextInt());
                arrayrating.add(sc.nextInt());
            }

            for (int k = 0; k < arrayspace.size(); k++) {
                if (arrayspace.get(k) > spaceDisk){
                    arrayrating.set(k, 0);
                }
            }

            System.out.println(Collections.max(arrayrating));
        }
    }
}