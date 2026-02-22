public class LeapYear{

    public static void main(String[] leapyear) {

               int year = 2024;
        boolean isLeap = false;

        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

                if (isLeap) {
            System.out.println(year + " is a leap year.");
        } 
else {
            System.out.println(year + " is not a leap year.");
        }
    }
}