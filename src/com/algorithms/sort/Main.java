package com.algorithms.sort;

import java.util.Arrays;

public class Main {

    //Swap values at 2 different indexes
    public static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // Bubble Sort implementation
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                swap(a,j,j+1);
                }
            }
        }
    }

    // Selection Sort implementation
    public static void selectionSort(int[] a) {
        int minIndex;
        for (int i = 0; i < a.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(a,i,minIndex);
            }
        }
    }
    public static void insertionSort(int[] a){
        int j;
        for(int i=1;i<a.length;i++){
            int key=a[i];
            for ( j=i-1;j>=0;j--) {
                if (a[j] > key) {
                    a[j + 1] = a[j];
                } else break;
            }
            a[j+1] = key;

        }
    }

    //QuickSort implementation

        public static void quickSort(int[] array, int LB, int UB) {
            if (LB < UB) {
                int partitionIndex = partition(array, LB, UB);
                quickSort(array, LB, partitionIndex - 1);
                quickSort(array, partitionIndex + 1, UB);
            }
        }

        private static int partition(int[] array, int LB, int UB) {
            int i = LB;
            int j = UB + 1;
            int key = array[LB];

            do {
                do {
                    i++;
                } while (i <= UB && array[i] < key);

                do {
                    j--;
                } while (array[j] > key);

                if (i < j) {
                    swap(array, i, j);
                }
            } while (i <= j);

            swap(array, LB, j);

            return j;
        }







    public static void main(String args[]) {
        int[] array1 = {55, 11, 99, 72, 3, 12, 2};
        int[] array2 = {33, 21, 4, 3, 2};
        int[] array3 = {33,12,17, 21, 4, 3, 2};
        int[] array4 = {55, 11, 99, 72, 3, 12, 2};
        // Applying Bubble Sort to array1
        bubbleSort(array1);

        // Applying Selection Sort to array2
        selectionSort(array2);

        insertionSort(array3);

        quickSort(array4, 0, array4.length - 1);
        // Displaying sorted arrays
        System.out.println("Bubble Sorted array: " + Arrays.toString(array1));
        System.out.println("Selection Sorted array: " + Arrays.toString(array2));
        System.out.println("Insertion Sorted array: " + Arrays.toString(array3));
        System.out.println("QuickSort:"+Arrays.toString(array4));
    }
}
