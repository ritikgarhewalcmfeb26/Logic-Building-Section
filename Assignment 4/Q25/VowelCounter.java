import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("The number of vowels in '" + input + "' is " + count);

        scanner.close();
    }
}