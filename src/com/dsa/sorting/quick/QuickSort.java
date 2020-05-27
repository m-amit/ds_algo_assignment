package com.dsa.sorting.quick;

public class QuickSort {

  public void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int lowerBound, int upperBound){
    if(lowerBound < upperBound){
      int start = lowerBound;
      int end = upperBound;
      int newBound = pratition(arr, start, end);
      quickSort(arr, start, newBound -1);
      quickSort(arr, newBound +1, end);
    }
  }

  private int pratition(int[] arr, int start, int end){
    int lowerBound = start;
    int upperBound = end;
    int pivot = arr[lowerBound];
    while(lowerBound < upperBound){
      while(lowerBound < arr.length && arr[lowerBound] <= pivot){
        lowerBound++;
      }
      while (arr[upperBound] > pivot ){
        upperBound--;
      }
      if(lowerBound < upperBound){
        swap(arr, lowerBound, upperBound);
      }
    }
    swap(arr, start, upperBound);
    return upperBound;
  }

  private void swap(int[] arr, int pointA, int pointB) {
      int temp = arr[pointA];
      arr[pointA] = arr[pointB];
      arr[pointB] = temp;
  }

}
