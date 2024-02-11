 import java.util.Scanner;

    public class Grade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();


            String[] studentNames = new String[numStudents];
            double[] studentGrades = new double[numStudents];


            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                studentNames[i] = scanner.next();
                System.out.print("Enter the grade for " + studentNames[i] + ": ");
                studentGrades[i] = scanner.nextDouble();
            }


            double sum = 0;
            double highestGrade = studentGrades[0];
            double lowestGrade = studentGrades[0];

            for (double grade : studentGrades) {
                sum += grade;

                if (grade > highestGrade) {
                    highestGrade = grade;
                }

                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            }


            double average = sum / numStudents;


            System.out.println("\nGrade Summary:");
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highestGrade);
            System.out.println("Lowest Grade: " + lowestGrade);


            System.out.println("\nIndividual Student Grades:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println(studentNames[i] + ": " + studentGrades[i]);
            }
        }
    }
