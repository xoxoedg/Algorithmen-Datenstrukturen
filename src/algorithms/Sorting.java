package algorithms;

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
        for (int i = 0; i < n; i++) {
            int min = 0;
            for (int j = i + 1; j < n - 1; j++) {
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

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
