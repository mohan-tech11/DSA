package DSA;

import java.util.Arrays;

public class MergeSort {
    static void sort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        sort(numbers, left, middle);
        sort(numbers, middle + 1, right);
        merge(numbers, left, middle, right);
    }

    static void merge(int[] numbers, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = numbers[i++];
        }

        while (j <= right) {
            temp[k++] = numbers[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            numbers[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11, 42, 78, 89, 122};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        sort(numbers, 0, numbers.length - 1);

        System.out.println("After sorting:  " + Arrays.toString(numbers));
    }
}