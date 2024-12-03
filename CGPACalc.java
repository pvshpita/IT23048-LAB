import java.util.Scanner;


public class CGPACalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double total_gpa = 0;
        int totalCredits = 0, creditsEarned = 0;


        System.out.print("Enter your Student ID: ");
        String ID = scanner.nextLine();


            // COURSE 1
            System.out.println("Course 1:");


            System.out.print("Enter the credit hours of the course: ");
            int credits = scanner.nextInt();


            System.out.print("Enter class test marks (out of 30): ");
            double CT = scanner.nextDouble();


            System.out.print("Enter attendance marks (out of 10): ");
            double AT = scanner.nextDouble();


            System.out.print("Enter final examination marks (out of 60): ");
            double FE = scanner.nextDouble();


            double totalMarks = AT + CT + FE;


            double gpa = 0;
            if (totalMarks >= 90) gpa = 4.0;
            else if (totalMarks >= 80) gpa = 3.8;
            else if (totalMarks >= 75) gpa = 3.75;
            else if (totalMarks >= 70) gpa = 3.5;
            else if (totalMarks >= 65) gpa = 3.25;
            else if (totalMarks >= 60) gpa = 3.0;
            else if (totalMarks >= 50) gpa = 2.75;
            else if (totalMarks >= 40) gpa = 2.5;
            else gpa = 0;


            total_gpa += gpa * credits;
            totalCredits += credits;
            if (gpa > 0) {
                creditsEarned += credits;
            }


            // COURSE 2
            System.out.println("Course 2:");


            System.out.print("Enter the credit hours of the course: ");
            credits = scanner.nextInt();


            System.out.print("Enter class test marks (out of 30): ");
            CT = scanner.nextDouble();


            System.out.print("Enter attendance marks (out of 10): ");
            AT = scanner.nextDouble();


            System.out.print("Enter final examination marks (out of 60): ");
            FE = scanner.nextDouble();


            totalMarks = AT + CT + FE;


            gpa = 0;
            if (totalMarks >= 90) gpa = 4.0;
            else if (totalMarks >= 80) gpa = 3.8;
            else if (totalMarks >= 75) gpa = 3.75;
            else if (totalMarks >= 70) gpa = 3.5;
            else if (totalMarks >= 65) gpa = 3.25;
            else if (totalMarks >= 60) gpa = 3.0;
            else if (totalMarks >= 50) gpa = 2.75;
            else if (totalMarks >= 40) gpa = 2.5;
            else gpa = 0;


            total_gpa += gpa * credits;
            totalCredits += credits;
            if (gpa > 0) {
                creditsEarned += credits;
            }


            // COURSE 3
            System.out.println("Course 3:");


            System.out.print("Enter the credit hours of the course: ");
            credits = scanner.nextInt();


            System.out.print("Enter class test marks (out of 30): ");
            CT = scanner.nextDouble();


            System.out.print("Enter attendance marks (out of 10): ");
            AT = scanner.nextDouble();


            System.out.print("Enter final examination marks (out of 60): ");
            FE = scanner.nextDouble();


            totalMarks = AT + CT + FE;


            gpa = 0;
            if (totalMarks >= 90) gpa = 4.0;
            else if (totalMarks >= 80) gpa = 3.8;
            else if (totalMarks >= 75) gpa = 3.75;
            else if (totalMarks >= 70) gpa = 3.5;
            else if (totalMarks >= 65) gpa = 3.25;
            else if (totalMarks >= 60) gpa = 3.0;
            else if (totalMarks >= 50) gpa = 2.75;
            else if (totalMarks >= 40) gpa = 2.5;
            else gpa = 0;


            total_gpa += gpa * credits;
            totalCredits += credits;
            if (gpa > 0) {
                creditsEarned += credits;
            }


            double cgpa = total_gpa / totalCredits;


            String letterGrade = "";
            if (cgpa >= 3.9) letterGrade = "A+";
            else if (cgpa >= 3.8) letterGrade = "A";
            else if (cgpa >= 3.75) letterGrade = "A-";
            else if (cgpa >= 3.5) letterGrade = "B+";
            else if (cgpa >= 3.25) letterGrade = "B";
            else if (cgpa >= 3.0) letterGrade = "B-";
            else if (cgpa >= 2.75) letterGrade = "C+";
            else if (cgpa >= 2.5) letterGrade = "D";
            else letterGrade = "F";


        System.out.println();
        System.out.println("Student ID: " + ID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + creditsEarned);
        System.out.printf("CGPA: %.2f", cgpa);
        System.out.println("Grade: " + letterGrade);


        scanner.close();
    }
}