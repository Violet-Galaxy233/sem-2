class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    public static  String FRESHMAN = "Freshman";
    public static  String SOPHOMORE = "Sophomore";
    public static  String JUNIOR = "Junior";
    public static  String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);// Constructor
        this.status = status;
    }

    public String toString() {
        return "Student: " + name;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Employee: " + name;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Faculty: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return "Staff: " + name;
    }
}

public class test1 {
    public static void main(String[] args) {
        Person p = new Person("Alice", "123 Main St", "60-3456789", "alice@email.com");
        Student s = new Student("Bob", "456 High St", "60-9876543", "bob@email.com", Student.FRESHMAN);
        MyDate d = new MyDate(11, 4, 2025);
        Employee e = new Employee("Carol", "789 College Rd", "60-1122334", "carol@email.com", "A101", 3000, d);
        Faculty f = new Faculty("David", "321 Uni Ave", "60-9988776", "david@email.com", "B202", 5000, d, "10-12am", "Professor");
        Staff st = new Staff("Eve", "654 Staff Rd", "60-5566778", "eve@email.com", "C303", 3500, d, "Administrator");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
 