// A class to represent a simple date (used for hiring date)
class MyDate {
    private int day, month, year;

    // Constructor to initialize day, month, and year
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns the date in "day/month/year" format
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

// Base class representing a generic person
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    // Constructor for Person class
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display all personal information
    @Override
    public String toString() {
        return "Class: Person\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email;
    }
}

// Subclass of Person representing a student
class Student extends Person {
    // Constant values for student status
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status; // e.g., Freshman, Sophomore, etc.

    // Constructor for Student
    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    // Display all student details
    @Override
    public String toString() {
        return "Class: Student\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email + "\n" +
               "Status: " + status;
    }
}

// Subclass of Person representing an employee
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired; // Custom MyDate class

    // Constructor for Employee
    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Display all employee details
    public String toString() {
        return "Class: Employee\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email + "\n" +
               "Office: " + office + "\n" +
               "Salary: " + salary + "\n" +
               "Date Hired: " + dateHired;
    }
}

// Subclass of Employee representing a faculty member
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    // Constructor for Faculty
    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Display all faculty details
    public String toString() {
        return "Class: Faculty\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email + "\n" +
               "Office: " + office + "\n" +
               "Salary: " + salary + "\n" +
               "Date Hired: " + dateHired + "\n" +
               "Office Hours: " + officeHours + "\n" +
               "Rank: " + rank;
    }
}

// Subclass of Employee representing a staff member
class Staff extends Employee {
    private String title;

    // Constructor for Staff
    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    // Display all staff details
    public String toString() {
        return "Class: Staff\n" +
               "Name: " + name + "\n" +
               "Address: " + address + "\n" +
               "Phone: " + phoneNumber + "\n" +
               "Email: " + email + "\n" +
               "Office: " + office + "\n" +
               "Salary: " + salary + "\n" +
               "Date Hired: " + dateHired + "\n" +
               "Title: " + title;
    }
}

// Main test class to create and print all object types
public class test1 {
    public static void main(String[] args) {
        // Create sample data
        Person p = new Person("AA", "123A", "60-3456789", "a@email.com");
        Student s = new Student("BB", "456B", "60-9876543", "b@email.com", Student.FRESHMAN);
        MyDate d = new MyDate(11, 4, 2025);
        Employee e = new Employee("CC", "789ee", "60-1122334", "c@email.com", "A1", 3000, d);
        Faculty f = new Faculty("DD", "321dd", "60-9988776", "d@email.com", "B2", 5000, d, "10-12am", "Professor");
        Staff st = new Staff("EE", "123ee", "60-5566778", "e@email.com", "C3", 3500, d, "Administrator");

        // Print details of each object using their toString()
        System.out.println(p + "\n");
        System.out.println(s + "\n");
        System.out.println(e + "\n");
        System.out.println(f + "\n");
        System.out.println(st + "\n");
    }
}