package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {
  public static void sort (int array[]) {

    int i, j, k, min, n = array.length;


    for (i = 0; i < n - 1; i++) {
      min = i;
      for (j = i + 1; j < n; j++)
        if (array[j] < array[min])
          min = j;

      //поменяем местами a [min] и a[i]
      k = array[i];
      array[i] = array[min];
      array[min] = k;
    }
  }


  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
