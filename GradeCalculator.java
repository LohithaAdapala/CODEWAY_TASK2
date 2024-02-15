import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        int numSubjects;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject (Out of 100) " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        
        System.out.println("Total Marks: " + totalMarks);

     
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

    
        char grade = calculateGrade(averagePercentage);

      
        System.out.println("Grade: " + grade);

        scanner.close();
    }


    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 60) {
            return 'C';
        } else if (averagePercentage >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
