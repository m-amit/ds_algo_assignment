package com.dsa.array.nge;

/**
 * @author Amit Mishra
 * @Date 16 jan 2020
 * The type Nge arrays.
 */
public class NGEArrays {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    //int [] arr = new int[]{11, 13, 21, 3, 42, 5};
    int [] arr = new int[]{4, 5, 2, 25, 7, 32, 8, 6};

    for (int i = 0; i < arr.length; i++) {
      int currentElement = arr[i];
      int nextBig = -1;
      for(int j=i;j<arr.length;j++){
        if(currentElement < arr[j]){
          nextBig = arr[j];
          break;
        }
      }
      System.out.println(currentElement +"-"+nextBig);
    }
  }
}
