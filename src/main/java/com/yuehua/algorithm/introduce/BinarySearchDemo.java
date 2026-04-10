package com.yuehua.algorithm.introduce;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int i = binarySearch(arr, 3);
        int j = binarySearch(arr, 5);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            }else if (guess > item) {
                high = mid - 1;
            }else  {
                low = mid + 1;
            }
        }
        return -1;
    }
}
