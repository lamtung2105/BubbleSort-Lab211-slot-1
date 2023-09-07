package bubblesort.bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 * This program allows users to input the number of elements in an array,
 * generates random integers within a specified range for each element, and then
 * displays the unsorted and sorted arrays using the bubble sort algorithm.
 */
public class BubbleSort {

    /**
     * The main method of the program.
     *
     * @param args command line arguments return void
     */
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompt the user to input the number of elements in the array,if the number is below 0,do nothing
        do {
            System.out.println("Enter number of array: ");
            number = scanner.nextInt();
        } while (number <= 0);

        // Create the array and generate random integers
        int[] array = generateRandomArray(number);

        // Display the unsorted array
        System.out.print("Unsorted Array: ");
        displayArray(array);

        // Sort the array using bubble sort
        bubbleSort(array);

        // Display the sorted array
        System.out.print("Sorted Array: ");
        displayArray(array);

        scanner.close();
    }

    /**
     * Generate the a random array base on the input
     *
     * @param array the number to be randomly generated
     */
    public static int[] generateRandomArray(int number) {
        int[] array = new int[number];
        Random rd = new Random();
        for (int i = 0; i < number; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    /**
     * Display the given array.
     *
     * @param array the array to be displayed
     */
    public static void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Sorts the given array in ascending order using the bubble sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void bubbleSort(int[] array) {
        int number = array.length;
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
