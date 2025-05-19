import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Creat {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建输出文件 Salary.txt
        PrintWriter writer = new PrintWriter("Salary.txt");
        Random rand = new Random();

        for (int i = 1; i <= 1000; i++) {
            String firstName = "FirstName" + i;
            String lastName = "LastName" + i;

            // 随机选职位
            String[] ranks = {"assistant", "associate", "full"};
            String rank = ranks[rand.nextInt(ranks.length)];

            // 根据职位生成对应工资
            double salary = 0.0;
            if (rank.equals("assistant")) {
                salary = 50000 + (80000 - 50000) * rand.nextDouble();
            } else if (rank.equals("associate")) {
                salary = 60000 + (110000 - 60000) * rand.nextDouble();
            } else {
                salary = 75000 + (130000 - 75000) * rand.nextDouble();
            }

            // keep 2 decimal places
            writer.printf("%s %s %s %.2f\n", firstName, lastName, rank, salary);
        }

        writer.close();
        System.out.println("Salary.txt has been created。");
    }
}