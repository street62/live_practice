package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    public void bubbleTest() {
        int[] nums = {3, -1, 4, -2, 5, 10};

//        Sort.bubbleSortRecursive(nums);
//
//        System.out.println(Arrays.toString(nums));
//
//        int prev = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            Assertions.assertTrue(nums[i] >= prev);
//            prev = nums[i];
//        }
    }

    @Test
    public void selectionSortTest() {
        int[] nums = {3, -1, 4, -2, 5, 10};

        Sort.selectionSort(nums);

        System.out.println(Arrays.toString(nums));

        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            Assertions.assertTrue(nums[i] >= prev);
            prev = nums[i];
        }
    }
}