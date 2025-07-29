//package week2;
//import java.util.Scanner;
//
//public class SimpleInterest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Principal Amount: ");
//        int principal = sc.nextInt();
//
//        System.out.print("Enter Time in Years: ");
//        int time = sc.nextInt();
//
//        int rate;
//
//        if (principal > 10000) {
//            rate = 10;
//        } else if (principal >= 5000) {
//            rate = 8;
//        } else {
//            rate = 5;
//        }
//
//        int simpleInterest = (principal * rate * time) / 100;
//
//        System.out.println("Principal: " + principal);
//        System.out.println("Time: " + time + " years");
//        System.out.println("Rate: " + rate + "%");
//        System.out.println("Simple Interest: " + simpleInterest);
//    }
//}
//
//package week2;
//import java.util.Scanner;
//
//public class MarksAndGrade {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int totalMarks = 0;
//        int numberOfSubjects = 5;
//        int[] marks = new int[numberOfSubjects];
//
//        // Input marks
//        for (int i = 0; i < numberOfSubjects; i++) {
//            System.out.print("Enter marks for subject " + (i + 1) + ": ");
//            marks[i] = sc.nextInt();
//            totalMarks += marks[i];
//        }
//
//        double averageMarks = totalMarks / (double) numberOfSubjects;
//
//        System.out.println("Total Marks: " + totalMarks);
//        System.out.println("Average Marks: " + averageMarks);
//
//        String grade;
//
//        if (averageMarks > 90) {
//            grade = "Ex";
//        } else if (averageMarks > 80) {
//            grade = "A";
//        } else if (averageMarks > 60) {
//            grade = "B";
//        } else if (averageMarks >= 40) {
//            grade = "C";
//        } else {
//            grade = "F";
//        }
//
//        System.out.println("Grade: " + grade);
//    }
//}
//
//package week2;
//
//import java.util.Scanner;
//
//public class InternetBill {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter total data consumed (GB): ");
//        int dataUsed = sc.nextInt();
//
//        int fixedCharge = 300;
//        int variableCharge = 0;
//
//        if (dataUsed < 10) {
//            variableCharge = 0;
//        } else if (dataUsed <= 30) {
//            variableCharge = (dataUsed - 10) * 5;
//        } else {
//            variableCharge = (20 * 5) + (dataUsed - 30) * 3;
//        }
//
//        int totalBill = fixedCharge + variableCharge;
//
//        System.out.println("Data Used: " + dataUsed + " GB");
//        System.out.println("Fixed Charge: Rs. " + fixedCharge);
//        System.out.println("Variable Charge: Rs. " + variableCharge);
//        System.out.println("Total Internet Bill: Rs. " + totalBill);
//    }
//}
