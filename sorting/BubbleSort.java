// Best case: O(n)
// Average case: O(n^2)
// Worst case: O(n^2)
package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        final int SIZE = arr.length;
    
        for (int i = 0; i < SIZE; i++) {
    
            // Stop looping and doing comparison 
            // if the entire array is already sorted
            boolean swap = false;
    
            for (int j = 0; j < SIZE - 1; j++) {
    
                // Swap pair of values
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
        
            // Break out of the outer loop if the
            // array is already sorted
            if (!swap) break;
        }
    }
}