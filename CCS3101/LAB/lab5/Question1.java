import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // define the month names and number of days in each month
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1 to 12): ");
        try {
            int monthIndex = input.nextInt(); // read the month number from user input
            
            // indexing starts from 0, so we need to subtract 1 from the month number
            System.out.println(months[monthIndex - 1] + " has " + dom[monthIndex - 1] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong number");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        input.close();
    }
}
