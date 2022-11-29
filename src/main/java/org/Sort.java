package org;

public class Sort {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


//    public static void bubbleSortRecursive(int[] nums) {
//        sort(nums.length - 1, nums);
//    }
//
//    public static void sort(int lastIdx, int[] nums) {
//        if (lastIdx == 0) {
//            return;
//        }
//
//        for (int j = 0; j < lastIdx - 1; j++) {
//            if (nums[j] > nums[j + 1]) {
//                int temp = nums[j];
//                nums[j] = nums[j + 1];
//                nums[j + 1] = temp;
//            }
//        }
//
//        sort(lastIdx - 1, nums);
//    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }
}
