import java.io.*;
import java.util.*;

public class StudentGrader {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            Scanner sc = new Scanner(new File(inputFile));
            PrintWriter pw = new PrintWriter(new FileWriter(outputFile))
        ) {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();      // Read student name
                String matric = sc.nextLine();    // Read matric number

                double test1 = Double.parseDouble(sc.nextLine()); // 20%
                double test2 = Double.parseDouble(sc.nextLine()); // 20%
                double lab = Double.parseDouble(sc.nextLine());   // 20%
                double finalExam = Double.parseDouble(sc.nextLine()); // 40%

                double totalScore = test1 + test2 + lab + finalExam;
                String grade = calculateGrade(totalScore);

                // Write to output file
                pw.println(name);
                pw.println(matric);
                pw.printf("Total Score: %.2f\n", totalScore);
                pw.println("Grade: " + grade);
                pw.println(); // blank line between students
            }

            System.out.println("Student scores processed successfully.");
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }

    public static String calculateGrade(double score) {
        if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else if (score >= 50) return "D";
        else return "F";
    }
}