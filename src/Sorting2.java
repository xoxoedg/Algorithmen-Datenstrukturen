public class Sorting2 {

    public static void main(String[] args) {


    }

    private void bubbleSort(int a[]) {
        int n = a.length;
        for (int i=0; i < n-1;i++) {
            for (int j = 0; j< n-i-1;j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    private void insertionSort(int a[]) {
        int n = a.length;
        for (int i=1; i <n;i++) {
            int key = a[i];
            int j = i;
            while (j>0 && a[j-1] > key) {
                a[j] = a[j-1];
                j--;
            }
        a[j] = key;
        }
    }

    private void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])  {
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

}
