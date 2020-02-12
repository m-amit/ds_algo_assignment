package com.dsa.array.subarray.sum;

public class SmallestSubArrayOfSizeK {

  public static void main(String[] args) {
    int[] arr = {10, 4, 3, -7 , 6, 3, 8 , 1};
    findSubArWithSumK(arr, 0);
  }

  //will work for values greater than 0
  static void findSubArWithSumK(int[] arr, int k) {
    //check if sum is greater than 0
    int start = -1;
    int end = -1;
    int min = Integer.MAX_VALUE;
    int j = 0;
    //run the loop till length
    for (int i = 0; i < arr.length; i++) {
      j = i;
      int sum = 0;
      while (sum <= k && j < arr.length) {
        sum += arr[j];
        int newMin = j - i + 1;
        if (sum == k && min > newMin) {
          start = i;
          end = j;
          min = newMin;
          break;
        }
        j++;
      }
    }
    if (min == Integer.MAX_VALUE) {
      System.out.println("There is no sub array which sums to " + k);
    }
    while (start <= end) {
      System.out.print(arr[start++] + " ");
    }
  }
}
