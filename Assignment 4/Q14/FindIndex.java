import java.util.Scanner;
import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("The number " + target + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}