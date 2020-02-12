package com.dsa.sorting.insertion;

import java.util.Arrays;

/**
 * The type Insertion sort.
 * @author Amit Mishra
 * @date 1st feb 2020
 */
public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 5, 7, 9, 6, 4, 3, 8};
    int[] sortedArr = insertionSort(arr);
    System.out.println(Arrays.toString(sortedArr));
  }

  static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i;
      while (j != 0) {
        if (arr[j - 1] > arr[j]) {
          int k = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = k;
        } else {
          break;
        }
        j--;
      }
    }
    return arr;
  }

}
