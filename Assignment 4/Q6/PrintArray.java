import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
        scanner.close();
    }
}