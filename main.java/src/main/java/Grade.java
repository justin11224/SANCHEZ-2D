package main.java;
import java.util.Scanner;

public class Grade   {
    
    
    public String assignGrade(double averageScore) {
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public void calculateGrades() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nDetails for Student " + (i + 1));
            
            System.out.print("Enter Student Name: ");
            String name = sc.next();

            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();

            double totalScore = 0;

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                double score = sc.nextDouble();
                totalScore += score;
            }
            double averageScore = totalScore / numSubjects;
            String grade = assignGrade(averageScore);

            System.out.println("Student: " + name);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Grade sg = new Grade();
        sg.calculateGrades();
    }
}
