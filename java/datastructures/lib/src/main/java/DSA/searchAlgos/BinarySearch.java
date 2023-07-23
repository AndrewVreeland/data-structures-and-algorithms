package DSA.searchAlgos;

import java.util.ArrayList;

public class BinarySearch {
  public static Integer binarySearch(ArrayList<Integer> arr, Integer input){
    int left = 0;
    int right = arr.size() - 1;

    while(left <= right){
      int mid = left + right / 2;

      if (input == mid){
        return mid;
      }
      if (input < mid){
        right = mid - 1;
        mid = left + right / 2;
      }
      if (input > mid){
        left = mid + 1;
        mid = left + right / 2;
      }

    }


    return -1;


  }
  }

