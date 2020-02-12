package com.dsa.sorting.merge;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = new int[] {9, 1, 2, 4, 3, 6, 8, 2, 7};
    int low = 0;
    int high = arr.length;
    mergeSort(arr,low,high);

  }

  static void mergeSort(int[] arr, int low, int high) {
    if (low < high) {
      int mid = (high + low) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid+1, high);
      merge(arr, low, mid, high);
    }
  }

  static void merge(int[] arr, int low, int mid, int high) {
    int[] leftArray = new int[mid];
    int[] rightArray = new int[high - mid];

    int index = low;
    while (index <= mid) {
      leftArray[index] = arr[index];
      index++;
    }

    index = mid;
    while (index < high) {
      rightArray[index] = arr[index];
      index++;
    }

  }
}
