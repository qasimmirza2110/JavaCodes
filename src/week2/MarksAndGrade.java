package week2;
import java.util.Scanner;

public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];

        // Input marks
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averageMarks = totalMarks / (double) numberOfSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        String grade;

        if (averageMarks > 90) {
            grade = "Ex";
        } else if (averageMarks > 80) {
            grade = "A";
        } else if (averageMarks > 60) {
            grade = "B";
        } else if (averageMarks >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
}
