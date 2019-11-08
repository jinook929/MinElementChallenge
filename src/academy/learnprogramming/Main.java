package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numArray = readIntegers();
        System.out.println("Numbers entered = " + Arrays.toString(numArray));
        System.out.println("Minimum number = " + findMin(numArray));
    }

    private static int[] readIntegers() {

        System.out.print("The number of integers to compare : ");
        int count = scanner.nextInt();
//        scanner.nextLine();

        int[] numbers = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.print("Enter No." + (i +1) + " : ");
            numbers[i] = scanner.nextInt();
//            scanner.nextLine();
        }

        return numbers;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }
}
