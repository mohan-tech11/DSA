package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};
        int target = 9;
        int result = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result = i;
                break;
            }
        }

        System.out.println("Index: " + result);
    }
}
