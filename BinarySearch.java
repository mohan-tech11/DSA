package DSA;


public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 9};
        int target = 7;
        int left = 0;
        int right = numbers.length - 1;
        int result = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                result = middle;
                break;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("Index: " + result);
    }
}
