package com.dsa.sorting.merge;

import java.util.Arrays;

public class MergeSortTest {
  public static void main(String[] args) {
    int[] arr = new int[] {9, 1, 2, 4, 3, 6, 8, 2, 7};
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
