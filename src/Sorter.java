import java.io.*;

public class Sorter {
    public void selectionSort(int arr[]) {
        int n = arr.length;

            // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
                // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            }
        }
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    void sort(int arr[]){
        insertionSort(arr);
    }
    void sort2(int arr[]){
        selectionSort(arr);

    }
}
