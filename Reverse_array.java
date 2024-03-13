package javabeginner;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Dynamically allocate an array
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices toward the center
            start++;
            end--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));

        scanner.close();
    }
}
