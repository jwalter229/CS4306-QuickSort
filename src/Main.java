import java.util.*;

/*  used stackoverflow, w3schools, geeks for geeks */


public class Main {

    public static void main(String[] args) {

        int[] data = {13, 2, 3, 19, 9, 14, 8, 7, 4, 21, 2, 16, 11, 18};  //{ 8, 2, 3, 7, 1, 5, 6, 9 };
        System.out.println("Data Before Sort: " + Arrays.toString(data));

        System.out.println();

        int low = 0;
        int high = data.length - 1;

        quickSort(data, low, high);
        System.out.println("Data After Sort: " + Arrays.toString(data));
    }// end of main block

    // start of quickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // finding pivot point
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot
        // right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) //lower than j
            quickSort(arr, low, j);

        if (high > i) // higher than i
            quickSort(arr, i, high);

    }// end of quickSort method

}// end of main class
