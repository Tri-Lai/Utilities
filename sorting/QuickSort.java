package sorting;

public class QuickSort {

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p);
            quickSort(arr, p + 1, right);
        }
    }

    /*
     * Hoare partition
     * Return a partition point p
     * Where all elements arr[left -> p] <= all elements arr[p + 1, right]
    */
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[left], front = left, back = right;

        while(true) {

            // Traverse until front pointer larger than pivot
            while (arr[front] < pivot)
                front++;
            
            // Traverse until back pointer smaller than pivot
            while(arr[back] > pivot)
                back--;

            // If front pointer get through the back pointer
            if (front >= back)
                return back;

            // Swap the front pointer value and back pointer value
            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;

            // Move two pointer ahead after swapping
            front++;
            back--;
        }
    }
}
