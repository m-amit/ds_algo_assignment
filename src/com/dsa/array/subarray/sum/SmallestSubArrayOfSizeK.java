package com.dsa.array.subarray.sum;

import java.util.HashMap;

public class SmallestSubArrayOfSizeK {

  public static void main(String[] args) {
    int[] arr = {10, 4, 3, 2 , 6, 3, 8 , 1};
    //findSubArWithSumK(arr, 0);
    findSubArrayWithSumK(arr, 9);
  }

  static void findSubArrayWithSumK(int[] arr, int k){
    int sum = 0;
    int result = 0;
    HashMap<Integer,Integer> arr_count = new HashMap<>();

    for(int i=0;i<arr.length;i++){

      sum += arr[i];

      if(arr_count.containsKey(sum-k)){
        result += arr_count.get(sum-k);
      }
      arr_count.put(sum, arr_count.getOrDefault(sum, 0)+1);
    }

    System.out.println(result);
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
