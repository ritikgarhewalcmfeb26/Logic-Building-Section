import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String cleanString = original.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = "";
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            reversed += cleanString.charAt(i);
        }

        if (cleanString.equals(reversed)) {
            System.out.println("The string '" + original + "' is palindrome");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome");
        }

        scanner.close();
    }
}