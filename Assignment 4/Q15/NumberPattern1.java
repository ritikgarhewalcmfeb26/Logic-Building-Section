public class NumberPattern1 {
    public static void main(String[] args) {
        int max = 5;

        for (int i = 1; i <= max; i++) {
            printRow(i);
        }

        
        for (int i = max; i >= 2; i--) {
            printRow(i);
        }
    }

    
    public static void printRow(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.print(n);
            
            if (j < n) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}