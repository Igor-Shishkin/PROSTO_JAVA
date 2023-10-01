package com.prosto.java.recursion;

import java.util.Arrays;

public class BubbleSort {
    static int numberOfCheckin = 0;
    public static void main(String[] args) {
        double[] arr = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("After sorting: " + Arrays.toString(arr));
        System.out.println("Number of checking: " + numberOfCheckin);
    }

    private static void bubbleSort(double[] arr, int n) {
        if (n == 1) { return; }

        boolean isChanged = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                arr[i+1] += arr[i];
                arr[i] = arr[i+1] - arr[i];
                arr[i+1] = arr[i+1] - arr[i];
                isChanged = true;
            }
            numberOfCheckin++;
        }
        if (!isChanged) { return; }
        bubbleSort(arr, n-1);
    }
}






