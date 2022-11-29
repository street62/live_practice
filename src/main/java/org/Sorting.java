package org;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

    }

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

//    public static void selectionSort(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int minIdx = i;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[minIdx] > nums[j]) {
//                    minIdx = j;
//                }
//            }
//            int temp = nums[i];
//            nums[i] = nums[minIdx];
//            nums[minIdx] = temp;
//        }
//    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

//    public static void insertionSort(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            int j = i;
//            while (j > 0 && nums[j] < nums[j - 1]) {
//                int temp = nums[j];
//                nums[j] = nums[j - 1];
//                nums[j - 1] = temp;
//                j -= 1;
//            }
//        }
//    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int cur = i;
            while (cur > 0 && nums[cur] < nums[cur - 1]) {
                int temp = nums[cur];
                nums[cur] = nums[cur - 1];
                nums[cur - 1] = temp;
                cur -= 1;
            }
        }
    }

    public static void quickSort(int[] nums) {
        quickSortRecursive(0, nums.length - 1, nums);
    }

    private static void quickSortRecursive(int start, int end, int[] nums) {
        if (start >= end) {
            return;
        }

        int fixedIdx = partition(start, end, nums);

        quickSortRecursive(start, fixedIdx - 1, nums);
        quickSortRecursive(fixedIdx + 1, end, nums);
    }

    private static int partition(int start, int end, int[] nums) {
        System.out.println(Arrays.toString(nums));
        int pivot = end;
        int left = start;

        for (int i = start; i < pivot; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, left, i);
                left += 1;
            }
        }
        swap(nums, left, pivot);
        return left;
    }

    private static void swap(int[] nums, int left, int i) {
        int temp = nums[left];
        nums[left] = nums[i];
        nums[i] = temp;
    }

//    public static void quickSort(int[] nums) {
//        quickSortRecursive(0, nums.length - 1, nums);
//    }
//
//    private static void quickSortRecursive(int start, int end, int[] nums) {
//        if (start >= end) {
//            return;
//        }
//
//        int fixed = partition(start, end, nums);
//
//        quickSortRecursive(start, fixed - 1, nums);
//        quickSortRecursive(fixed + 1, end, nums);
//    }
//
//    private static int partition(int start, int end, int[] nums) {
//        int pivot = end;
//        int partition = start;
//
//        for (int i = start; i < end; i++) {
//            if (nums[i] < nums[pivot]) {
//                int temp = nums[i];
//                nums[i] = nums[partition];
//                nums[partition] = temp;
//                partition += 1;
//            }
//
//        }
//        int temp = nums[partition];
//        nums[partition] = nums[pivot];
//        nums[pivot] = temp;
//
//        return partition;
//    }

    public static void mergeSort(int[] nums) {
        int[] sorted = mergeSortRecursive(nums);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sorted[i];
        }
    }

    private static int[] mergeSortRecursive(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSortRecursive(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSortRecursive(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeAndSort(left, right);
    }

    private static int[] mergeAndSort(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftIdx = 0; int rightIdx = 0; int curIdx = 0;
        while (curIdx < merged.length) {
            int leftValue = (leftIdx == left.length) ? Integer.MAX_VALUE : left[leftIdx];
            int rightValue = (rightIdx == right.length) ? Integer.MAX_VALUE : right[rightIdx];

            if (leftValue <= rightValue) {
                merged[curIdx] = leftValue;
                leftIdx += 1;
            } else {
                merged[curIdx] = rightValue;
                rightIdx += 1;
            }
            curIdx += 1;
        }
        return merged;
     }


//    public static void mergeSort(int[] nums) {
//        int[] sorted = mergeSortRecursive(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sorted[i];
//        }
//    }
//
//    private static int[] mergeSortRecursive(int[] nums) {
//        if (nums.length <= 1) {
//            return nums;
//        }
//
//        int mid = nums.length / 2;
//        int[] left = mergeSortRecursive(Arrays.copyOfRange(nums, 0, mid));
//        int[] right = mergeSortRecursive(Arrays.copyOfRange(nums, mid, nums.length));
//
//        return mergeSortedArrays(left, right);
//    }

//    private static int[] sortAndMergeArrays(int[] left, int[] right) {
//        int[] newArray = new int[left.length + right.length];
//        int leftIdx = 0; int rightIdx = 0; int newIdx = 0;
//
//        while (newIdx < newArray.length) {
//            int leftValue = (leftIdx == left.length) ? Integer.MAX_VALUE : left[leftIdx];
//            int rightValue = (rightIdx == right.length) ? Integer.MAX_VALUE : right[rightIdx];
//
//            if (leftValue <= rightValue) {
//                newArray[newIdx] = leftValue;
//                leftIdx += 1;
//            } else {
//                newArray[newIdx] = rightValue;
//                rightIdx += 1;
//            }
//            newIdx += 1;
//        }
//        return newArray;
//    }

    private static int[] mergeSortedArrays(int[] left, int[] right) {
        int[] newArray = new int[left.length + right.length];
        int leftIdx = 0; int rightIdx = 0; int newIdx = 0;

        while (leftIdx < left.length && rightIdx < right.length) {
            int leftValue = left[leftIdx];
            int rightValue = right[rightIdx];

            if (leftValue <= rightValue) {
                newArray[newIdx] = leftValue;
                leftIdx += 1;
            } else {
                newArray[newIdx] = rightValue;
                rightIdx += 1;
            }
            newIdx += 1;
        }
        while (leftIdx < left.length) {
            newArray[newIdx] = left[leftIdx];
            leftIdx += 1;
            newIdx += 1;
        }

        while (rightIdx < right.length) {
            newArray[newIdx] = right[rightIdx];
            rightIdx += 1;
            newIdx += 1;
        }

        return newArray;
    }


}
