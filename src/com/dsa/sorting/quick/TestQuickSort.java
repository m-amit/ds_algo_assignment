package com.dsa.sorting.quick;

import java.util.Arrays;

public class TestQuickSort {
  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    int [] arr = new int[]{99,7,6,10,5,9,2,1,15,7,2,0};
    qs.quickSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
