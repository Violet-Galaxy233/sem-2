import java.util.ArrayList;
import java.util.Date;

// A simple class representing a custom date
class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate: " + day + "/" + month + "/" + year;
    }
}

// A simple class representing a Loan
class Loan {
    private double amount;
    private double interestRate;
    private int years;

    // Constructor to initialize the Loan object
    public Loan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    // toString method to return a string representation of the Loan object
    @Override
    public String toString() {
        return "Loan: amount = " + amount + ", interest rate = " + interestRate + "%, years = " + years;
    }
}

// A simple class representing a Circle
class Circle {
    private double radius;

    // Constructor to initialize the Circle object
    public Circle(double radius) {
        this.radius = radius;
    }

    // toString method to return a string representation of the Circle object
    @Override
    public String toString() {
        return "Circle: radius = " + radius + ", area = " + Math.PI * radius * radius;
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store different types of objects
        ArrayList<Object> list = new ArrayList<>();

        // Add a Loan object
        list.add(new Loan(10000, 5, 10));

        // Add a java.util.Date object (system current date/time)
        list.add(new Date());

        // Add a String object
        list.add("Hello, I am a string!");

        // Add a Circle object
        list.add(new Circle(2));

        // Add a custom MyDate object
        list.add(new MyDate(16, 5, 2025));

        // Print all objects using their toString() method
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}