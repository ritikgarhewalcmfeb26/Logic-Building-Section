import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        System.out.print("Enter 4 names: ");
        for (int i = 0; i < 4; i++) {
            names[i] = scanner.next();
        }

        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}