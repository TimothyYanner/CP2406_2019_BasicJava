package week6;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] integerArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        displayIntegers(integerArray);
        displayReverse(integerArray);
        displaySum(integerArray);
        displayLessThanArg(integerArray, 10);
        displayHigherThanAvg(integerArray);
    }

    public static void displayIntegers(int[] array) {
        int i;
        for (i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }

    public static void displayReverse(int[] array) {
        int i;
        for (i = array.length - 1; i >= 0; --i) {
            System.out.println(array[i]);
        }
    }

    public static void displaySum(int[] array) {
        int i;
        int sum = 0;
        for (i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void displayLessThanArg(int[] array, int limitingArg) {
        int i;
        for (i = 0; i < array.length; ++i) {
            if (array[i] < limitingArg) {
                System.out.println(array[i]);
            }
        }
    }

    public static void displayHigherThanAvg(int [] array) {
        int avg = 0;
        int i;
        for (i = 0; i < array.length; ++i) {
            avg = (avg + array[i]) / 2;
        }
        for (i = 0; i < array.length; ++i) {
            if (array[i] > avg) {
                System.out.println(array[i]);
            }
        }
    }
}

