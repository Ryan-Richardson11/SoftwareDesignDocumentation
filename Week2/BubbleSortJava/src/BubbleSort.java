import java.util.Arrays;

/**
 * BubbleSort class, contains a bubblesort method for a given array.
 */
public class BubbleSort {

    /**
     * swap method, takes two elements in an array and swaps them.
     * @param A An inputted array.
     * @param i Index of the first element being swapped.
     * @param j Index of the second element being swapped.
     */
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    /**
     * bubbleSort method, performs bubble sort algorithm on a given array.
     * @param A An array of integers.
     */
    public static void bubbleSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                }
            }
        }
    }

    /**
     * main method, creates an array of integers and passes it as an arguemnt to bubbleSort method.
     * Sorted array is printed out.
     * @param args Unused commnad line argument.
     */
    public static void main(String[] args) {
        int[] myArray = { 2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56 };
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}