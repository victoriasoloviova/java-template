package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artemaliev on 07/09/15.
 */
public class IntSort {

     static  void sort(int array[], int l, int r) {
            if (l < r) {
                // номер середины массива
                int m = (l + r) / 2;

                // применяем сортировку к первой и второй половине массива
                sort(array, l, m);
                sort(array, m + 1, r);

                // применяем слияние к отсортированным половинкам
                merge(array, l, m, r);
            }
        }
      static  void merge(int array[], int l, int m, int r) {
            // Размеры половинок
            int n1 = m - l + 1;
            int n2 = r - m;

            int arr1[] = new int[n1];
            int arr2[] = new int[n2];

          /*Помещаем данные во временные масивы*/
            for (int i = 0; i < n1; ++i)
                arr1[i] = array[l + i];
            for (int j = 0; j < n2; ++j)
                arr2[j] = array[m + 1 + j];
            /* объединяем временные массивы */

            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (arr1[i] <= arr2[j]) {
                    array[k] = arr1[i];
                    i++;
                } else {
                    array[k] = arr2[j];
                    j++;
                }
                k++;
            }
            /* копируем оставшиеся элементы arr1 если они есть */
            while (i < n1) {
                array[k] = arr1[i];
                i++;
                k++;
            }

            /* копируем оставшиеся элементы arr2 если они есть */
            while (j < n2) {
                array[k] = arr2[j];
                j++;
                k++;
            }
        }


    public static void sort (int array[]) {
        sort(array, 0, array.length-1);
    }

    public static void sort (List<Integer> list) {
        Collections.sort(list);
    }
}