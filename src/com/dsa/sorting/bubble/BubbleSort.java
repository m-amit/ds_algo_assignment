package com.dsa.sorting.bubble;

import java.util.Arrays;
/**
 * The type Bubble sort.
 * @author Amit Mishra
 * @date 1st feb 2020
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 5, 7, 9, 6, 4, 3, 8};
    int[] sorted = bubbleSort(arr);

    System.out.println(Arrays.toString(sorted));
  }

  private static int[] bubbleSort(int[] arr) {
    for (int i = arr.length - 1; i >= 0; i--) {
      int s = 0;
      while (s != i) {
        if (arr[s] > arr[s + 1]) {
          int k = arr[s + 1];
          arr[s + 1] = arr[s];
          arr[s] = k;
        }
        s++;
      }
    }
    return arr;
  }
}
