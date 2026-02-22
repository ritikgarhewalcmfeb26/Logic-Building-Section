import java.util.Scanner;

public class MenuDrivenProgram {

        static int defaultInt;
    static double defaultDouble;
    static boolean defaultBoolean;
    static String defaultString;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

               do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();
            System.out.println("-----------------");

            
            switch (choice) {
                case 1:
                    System.out.print("Enter your score (0-100): ");
                    int score = scanner.nextInt();
                    if (score >= 90) {
                        System.out.println("Grade: A");
                    } else if (score >= 80) {
                        System.out.println("Grade: B");
                    } else if (score >= 70) {
                        System.out.println("Grade: C");
                    } else if (score >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                    break;

                case 2:
                    System.out.print("Enter a year: ");
                    int year = scanner.nextInt();
                    
                    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                    if (isLeap) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a day number (1-7): ");
                    int day = scanner.nextInt();
                    
                    switch (day) {
                        case 1: System.out.println("Monday"); break;
                        case 2: System.out.println("Tuesday"); break;
                        case 3: System.out.println("Wednesday"); break;
                        case 4: System.out.println("Thursday"); break;
                        case 5: System.out.println("Friday"); break;
                        case 6: System.out.println("Saturday"); break;
                        case 7: System.out.println("Sunday"); break;
                        default: System.out.println("Invalid day number.");
                    }
                    break;

                case 4:
                    System.out.println("Default values of class-level variables:");
                    System.out.println("int: " + defaultInt);
                    System.out.println("double: " + defaultDouble);
                    System.out.println("boolean: " + defaultBoolean);
                    System.out.println("String (Object): " + defaultString);
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    
                    System.out.println("Invalid choice. Please select a number from 1 to 5.");
            }
        } while (choice != 5); 

        scanner.close();
    }
}