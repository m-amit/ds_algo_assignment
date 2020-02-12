package com.dsa.sorting.selection;

import java.util.Arrays;

/**
 * The type Selection sort.
 * @author Amit Mishra
 * @date 1st feb 2020
 */
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = new int[] {4, 5, 7, 1, 8, 3, 2};

    int[] sorted = selectionSort(arr);
    System.out.println(Arrays.toString(sorted));
  }

  private static int[] selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int min = i;
      int j = i + 1;
      while (j < arr.length) {
        if (arr[j] < arr[min]) {
          min = j;
        }
        j++;
      }
      j = arr[min];
      arr[min] = arr[i];
      arr[i] = j;
    }
    return arr;
  }
}
