package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numArray = readIntegers();
        System.out.println("numbers entered = " + Arrays.toString(numArray));
        System.out.println("minimum number = " + findMin(numArray));
    }

    public static int[] readIntegers() {

        System.out.print("The number of integers : ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for(int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
