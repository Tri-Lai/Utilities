package sorting;

public class CountingSort {
    public static int[] countSort(int[] arr) {
        final int SIZE = arr.length;
        int[] res = new int[SIZE]; // result array
        int[] freq = new int[SIZE]; // used for counting the occurrance

        // Count the frequency of appearance
        for (int k : arr) freq[k]++;

        // Cumulatively adding the frequency value
        for (int i = 1; i < SIZE; i++)
            freq[i] += freq[i-1];

        // Place the elements in appropriate position and
        // decrease the count by one 
        for (int j : arr) {
            res[freq[j] - 1] = j;
            --freq[j];
        }

        return res;
    }
}
