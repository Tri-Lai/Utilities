package sorting;

public class MergeSort {
    static void mergeSort(int[] arr) {
        final int SIZE = arr.length;

        if (SIZE < 2)
            return;

        int middle = SIZE/2;
    
        // Create 2 sub-arrays from arr
        int[] left = copyArr(arr, 0, middle - 1);
        int[] right = copyArr(arr, middle, SIZE - 1);

        // Divide the array into two sub arrays
        mergeSort(left);
        mergeSort(right);

        // Merge two sub array
        merge(left, right, arr);
    }

    // Create a new array based on the source array and start + end indices
    static int[] copyArr(int[] source, int startIdx, int endIdx) {
        int[] res = new int[endIdx - startIdx + 1];

        for (int i = 0; i < res.length; i++) 
            res[i] = source[startIdx + i];
        
        return res;
    }
    
    // Merge the two sub arrays into the original one
    static void merge(int[] left, int[] right, int[] dest) {
        final int SUB_LEFT = left.length;
        final int SUB_RIGHT = right.length;

        int p1 = 0, p2 = 0, p3 = 0;
        
        while(p1 < SUB_LEFT && p2 < SUB_RIGHT) {

            if (left[p1] < right[p2]) {
                dest[p3] = left[p1];
                p1++;
            } else {
                dest[p3] = right[p2];
                p2++;
            }
            p3++;
        }

        while (p1 < SUB_LEFT) 
            dest[p3++] = left[p1++];
    

        while (p2 < SUB_RIGHT)
            dest[p3++] = right[p2++];
    }
}
