public class Grade {
    public static void main(String[] marks) {

        int maths = 80;
        int science = 85;
        int history = 90;
       
        double average = (maths + science + history) / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 30) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Average Marks: " + (int)average);
        System.out.println("Grade: " + grade);
    }
}