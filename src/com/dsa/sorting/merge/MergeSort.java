package com.dsa.sorting.merge;

public class MergeSort {

  public void mergeSort(int[] arr) {
    int lb = 0;
    int ub = arr.length - 1;
    mergeSort(arr, lb, ub);
  }

  private void mergeSort(int[] arr, int low, int high) {
    if (low < high) {
      int mid = (high + low) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  /**
   * This merge method is backbone of merge sort
   * in this method I have taken three pointers pointer_a to operate on left sub-arr
   * pointer_b to operate on right sub-arr and pointer_c to add elements after comparing
   * left-arr[pointer_a] and right-arr[pointer_b]
   * there is a while loop which will control and identify when a array left/right exhausted.
   * if any of subarray is left will put that at last of tempArr
   * tempArr is of size of total elements of left_arr and right_arr
   * @param arr
   * @param low
   * @param mid
   * @param high
   */
  private static void merge(int[] arr, int low, int mid, int high) {
    int pointer_a = low;
    int pointer_b = mid + 1;
    int pointer_c = 0;
    int[] tempArr = new int[(high - low) + 1];
    while (pointer_a <= mid && pointer_b <= high) {
      if (arr[pointer_a] < arr[pointer_b]) {
        tempArr[pointer_c] = arr[pointer_a];
        pointer_a++;
      } else {
        tempArr[pointer_c] = arr[pointer_b];
        pointer_b++;
      }
      pointer_c++;
    }
    if (pointer_a > mid) {
      while (pointer_b <= high) {
        tempArr[pointer_c] = arr[pointer_b];
        pointer_b++;
        pointer_c++;
      }
    } else {
      while (pointer_a <= mid) {
        tempArr[pointer_c] = arr[pointer_a];
        pointer_a++;
        pointer_c++;
      }
    }
    int j = low;
    for (int i = 0; i < tempArr.length; i++) {
      arr[j] = tempArr[i];
      j++;
    }
  }
}
