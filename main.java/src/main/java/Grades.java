package main.java;

public class Grades {
    int studentId, subjectCount;
    String studentName;
    double subjectScore, totalScore, averageScore, grade;
    
    public void calculateGrades(int id, String name, double score, int subjectTotal, double totalMarks){
        this.studentId = id;
        this.studentName = name;
        this.subjectScore = score;
        this.subjectCount = subjectTotal;
        this.totalScore = totalMarks;
        this.averageScore = this.totalScore / this.subjectCount;
        this.grade = this.averageScore;
    }
    
    public void displayGradeDetails(){
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n", 
                          studentId, studentName, subjectScore, subjectCount, totalScore, averageScore, grade);
    }
}
