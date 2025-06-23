import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class analyst {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        Scanner input = new Scanner(file);

        double assistantTotal = 0, associateTotal = 0, fullTotal = 0;
        int assistantCount = 0, associateCount = 0, fullCount = 0;

        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            double salary = input.nextDouble();

            if (rank.equals("assistant")) {
                assistantTotal += salary;
                assistantCount++;
            } else if (rank.equals("associate")) {
                associateTotal += salary;
                associateCount++;
            } else if (rank.equals("full")) {
                fullTotal += salary;
                fullCount++;
            }
        }
        input.close();

        // calculate total and average for each rank
        double totalSalary = assistantTotal + associateTotal + fullTotal;
        int totalCount = assistantCount + associateCount + fullCount;

        System.out.printf("Assistant   - Total: %.2f, Average: %.2f\n", assistantTotal, assistantTotal / assistantCount);
        System.out.printf("Associate   - Total: %.2f, Average: %.2f\n", associateTotal, associateTotal / associateCount);
        System.out.printf("Full        - Total: %.2f, Average: %.2f\n", fullTotal, fullTotal / fullCount);
        System.out.printf("All Faculty - Total: %.2f, Average: %.2f\n", totalSalary, totalSalary / totalCount);
    }
}