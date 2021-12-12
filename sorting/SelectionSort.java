package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            
            // Find the smallest element in the array and swap 
            // with the last element in the sorted sub array
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[idx])
                    idx = j;
        
            // Doing swap
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
