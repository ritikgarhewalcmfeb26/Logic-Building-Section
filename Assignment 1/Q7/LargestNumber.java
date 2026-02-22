/* Write a Java program that finds and prints the largest of three predefined
numbers using if-else statements.*/

class LargestNumber {

    public static void main(String[] args) {
        
        int num1 = 25;
        int num2 = 78;
        int num3 = 42;

               if (num1 >= num2 && num1 >= num3) {
                        System.out.println(num1 + " is the largest number.");
            
        } else if (num2 >= num1 && num2 >= num3) {
           
            System.out.println(num2 + " is the largest number.");
            
        } 
	else {
                        System.out.println(num3 + " is the largest number.");
        }
    }
}