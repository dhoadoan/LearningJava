import java.util.Arrays;

public class SortingAlgo {
    public static void main (String[] args) {
        int[] sortArr = {3, 5, 8, 1, 2, 0, 3};
        bubbleSort(sortArr);
    }

    public static void bubbleSort(int[] arr) {
        for (int sortedIndex = arr.length; sortedIndex > 0; sortedIndex--) {
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                if (i == sortedIndex - 1) {
                    i = 0;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
