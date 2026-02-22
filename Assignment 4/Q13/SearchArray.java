import java.util.Scanner;
import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        if (Arrays.asList(numbers).contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}