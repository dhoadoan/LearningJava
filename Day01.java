import java.util.Arrays;

public class Day01 {
    /*
    1. Write a function that takes in an array of names and prints each name along with its frequency. For example:
    Input: [“Logan”, “Hoa”, “John”, “Logan”, “Minh”, “Hoa”].

    The function should print in the following:
    Logan : 2
    Hoa: 2
    John: 1
    Minh: 1
    ---
    2.Write a function that takes in a non-empty array of integers. Output the maximum number in the array. For example:
    Input: [4,-3,1,4,7,0]
    Output: 7
    * */

    public static void main(String[] args) {
        //String[] name = new String[] {"Logan", "Hoa", "John", "Logan", "Minh", "Hoa"};
        //printFreq(testArr);

        //int[] numArr = new int[] {4,-3,1,4,7,9};
        //System.out.println(findMax(numArr));
    }

    public static void printFreq(String[] arr) {
        int counter;
        boolean[] repeated = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (repeated[i] == true) {
                    break;
                }
                if (arr[i].equals(arr[j])) {
                    counter++;
                    repeated[j] = true;
                }
            }
            if (repeated[i]==false) {
                System.out.println(arr[i] + ": " + counter);
            } else {
                continue;
            }
        }
    }

    public static int findMax(int[] arr) {
        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }
}
