package live;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomSortTest {

    @Test
    void sort() {
        int[] nums = new int[] {3, 2, 1, 5, 6};
        RandomSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}