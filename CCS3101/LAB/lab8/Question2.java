import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        try (DataInputStream in = new DataInputStream(new FileInputStream("integers.dat"))) {
            System.out.println("Integers read from integers.dat:");
            while (true) {
                int num = in.readInt();       // read an integer
                System.out.println("[" + count + "] " + num);
                sum += num;
                count++;
            }
        } catch (EOFException e) {
            // normal end of file reached
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        System.out.println("Number of integers read: " + count);
        System.out.println("Sum of integers read: " + sum);
    }
}