package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicMath {
    public static void main(String[] args) {
        getPrimesLessOrEqualTo(10);
    }

    public static int[] getGcdAndLcm(int a, int b) {
        int bigger = Math.max(a, b);

        int gcd = Math.min(a, b);
        while (bigger % gcd != 0) {
            gcd = bigger % gcd;
        }

        int lcm = a * b / gcd;
        return new int[] {gcd, lcm};
    }

    public static List<Integer> getPrimesLessOrEqualTo(int num) {
        int[] arr = new int[num + 1];
        List<Integer> primes = new ArrayList<>();
        int start = 2;

        while(start <= num) {
            int newStart = 0;
            primes.add(start);
            for (int i = 1; i <= (num / start); i++) {
                if (arr[start * i] == 0) {
                    arr[start * i] = 1;
                }
            }
            for (int j = 0; j <= num - start; j++) {
                if (arr[start + j] == 0) {
                    newStart = start + j;
                    start = newStart;
                    break;
                }
            }
            if (newStart == 0) {
                break;
            }
        }
        return new ArrayList<>(primes);
    }
}
