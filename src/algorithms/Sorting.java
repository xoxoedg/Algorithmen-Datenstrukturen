package algorithms;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 5, 2, 12, 4, 8};
        //bubbleSort(arr);
        //System.out.println(arr.toString());
        insertionSort(arr);
        System.out.println(arr);
    }


    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min > i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    private static void mergeSort(int[] a) {
        if (a.length > 1) {
            int mid = a.length / 2;
            int[] lefthalf = Arrays.copyOfRange(a, 0, mid);
            int[] righthalf = Arrays.copyOfRange(a, mid, a.length);
            mergeSort(lefthalf);
            mergeSort(righthalf);
            merge(a, lefthalf, righthalf);

        }
    }

    private static void merge(int[] a, int[] lefthalf, int[] righthalf) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < lefthalf.length && j < righthalf.length) {
            if (lefthalf[i] <= righthalf[j]) {
                a[k] = lefthalf[i];
                i++;
            } else {
                a[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while (i < lefthalf.length) {
            a[k] = lefthalf[i];
            i++;
            k++;
        }

        while (j < righthalf.length) {
            a[k] = righthalf[j];
            i++;
            j++;
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, a.length);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, pivot);
        return i;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
