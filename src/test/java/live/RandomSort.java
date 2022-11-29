package live;

import java.util.Arrays;

public class RandomSort {

    public static void sort(int[] nums) {
        boolean[] temp = new boolean[100];

        for (int n : nums) {
            temp[n - 1] = true;
        }

        int curIndex = 0;

        for (int j = 0; j < temp.length; j++) {
            if (temp[j]) {
                nums[curIndex] = j + 1;
                curIndex += 1;
            }
        }
    }
}
