package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    private int[] nums;

    @BeforeEach
    public void initializeArray() {
        nums = new int[]{3, 2, 1, 0, -1, 4, 100, 29, -1};
    }

    @Test
    public void bubbleSortTest() {
        Sorting.bubbleSort(nums);

        int prev = nums[0];

        for (int num : nums) {
            Assertions.assertTrue(num >= prev);
            prev = num;
        }
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void selectionSortTest() {
        System.out.println(Arrays.toString(nums));
        Sorting.selectionSort(nums);
        int prev = nums[0];

        for (int num : nums) {
            Assertions.assertTrue(num >= prev);
            prev = num;
        }
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void insertionSortTest() {
        System.out.println("before: " + Arrays.toString(nums));
        Sorting.insertionSort(nums);
        int prev = nums[0];

        System.out.println("after: " + Arrays.toString(nums));
        for (int num : nums) {
            Assertions.assertTrue(num >= prev);
            prev = num;
        }
    }

    @Test
    public void quickSortTest() {
        System.out.println("before: " + Arrays.toString(nums));
        Sorting.quickSort(nums);
        int prev = nums[0];

        System.out.println("after: " + Arrays.toString(nums));
        for (int num : nums) {
            Assertions.assertTrue(num >= prev);
            prev = num;
        }
    }

    @Test
    public void mergeSortTest() {
        System.out.println("before: " + Arrays.toString(nums));
        Sorting.mergeSort(nums);
        int prev = nums[0];

        System.out.println("after: " + Arrays.toString(nums));
        for (int num : nums) {
            Assertions.assertTrue(num >= prev);
            prev = num;
        }
    }
}