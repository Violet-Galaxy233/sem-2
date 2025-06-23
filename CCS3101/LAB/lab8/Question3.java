import java.io.*;
import java.util.Date;

public class Question3 {
    public static void main(String[] args) {
        String filename = "mixedData.dat";

        // Writing binary data to file
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            // Write an array of integers
            int[] arr = {9, 8, 7, 1, 2, 3};
            out.writeInt(arr.length); // First write the length of the array
            for (int num : arr) {
                out.writeInt(num);    // Then write each element
            }
            out.writeDouble(11.5);

            Date now = new Date();
            out.writeLong(now.getTime());   // Write current date as a long 

            out.writeUTF("Hello, world!");

            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading binary data from file
        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            // Read the array of integers
            int length = in.readInt(); // Read array length first
            int[] arrRead = new int[length];
            for (int i = 0; i < length; i++) {
                arrRead[i] = in.readInt(); // Read each array element
            }

            double d = in.readDouble();// Read the date (as long)

            long time = in.readLong();
            Date date = new Date(time); // Read the date (as long)

            String str = in.readUTF();// Read the string

            // Output the results 
            System.out.println("\nData read from " + filename + ":");
            System.out.print("Array: ");
            for (int num : arrRead) {
                System.out.print(num + " ");
            }

            System.out.println("\nDouble: " + d);
            System.out.println("Date: " + date);
            System.out.println("String: " + str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}