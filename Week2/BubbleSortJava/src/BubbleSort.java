import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public static void bubbleSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56 };
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
