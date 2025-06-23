import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 70 + rand.nextInt(81); // 70 to 150 random integers
        int sum = 0;

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("integers.dat"))) {
            System.out.println("Integers written to integers.dat:");
            for (int i = 0; i < count; i++) {
                int num = rand.nextInt(); // random integer (might be negative)
                out.writeInt(num);
                sum += num;
                System.out.println("[" + i + "] " + num); // print each integer
            }
            System.out.println("Number of integers written: " + count);
            System.out.println("Sum of integers written: " + sum);
        } catch (IOException e) {
            e.printStackTrace(); // Handle file writing exceptions
        }
    }
}