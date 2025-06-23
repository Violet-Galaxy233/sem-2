import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Creat {
    public static void main(String[] args) throws FileNotFoundException {
        // create a file named Salary.txt
        PrintWriter writer = new PrintWriter("Salary.txt");
        Random rand = new Random();

        for (int i = 1; i <= 1000; i++) {
            String firstName = "FirstName" + i;
            String lastName = "LastName" + i;

            // randomly generate rank
            String[] ranks = {"assistant", "associate", "full"};
            String rank = ranks[rand.nextInt(ranks.length)];

            // randomly generate salary based on rank
            double salary = 0.0;
            if (rank.equals("assistant")) {
                salary = 50000 + (80000 - 50000) * rand.nextDouble();
            } else if (rank.equals("associate")) {
                salary = 60000 + (110000 - 60000) * rand.nextDouble();
            } else {
                salary = 75000 + (130000 - 75000) * rand.nextDouble();
            }

            // keep 2 decimal places
            writer.printf("%-12s %-12s %-12s %.2f\n", firstName, lastName, rank, salary);
        }

        writer.close();
        System.out.println("Salary.txt has been created。");
    }
}