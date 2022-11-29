package boj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Budongsan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        int q = Integer.parseInt(first[0]); int n = Integer.parseInt(first[1]);

        Set<Integer> occupied = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int num = Integer.parseInt(line);

            int cur = num;
            while (cur != 0) {
                if (occupied.contains(cur)) {
                    System.out.println(cur);
                    break;
                }
                cur /= 2;
            }
            if (cur == 0) {
                occupied.add(num);
                System.out.println(0);
            }
        }
    }
}
