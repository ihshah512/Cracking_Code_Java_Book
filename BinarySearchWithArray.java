import java.util.*;

public class BinarySearchWithArray {
    public static void binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                System.out.println(num + " found at index " + mid);
                return;
            }

            if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(num + " not found in the array.");
    }

    public static void main(String[] args) {
        int[] newArr = {1, 5, 8, 9, 11, 13, 15, 19, 21};
        int findNum = 9;
        binarySearch(newArr, findNum);
    }
}
