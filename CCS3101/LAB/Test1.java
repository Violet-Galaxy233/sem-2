
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Class Name: Person, Name: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class Name: Student, Name: " + name;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class Name: Employee, Name: " + name;
    }
}

class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty, Name: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class Name: Staff, Name: " + name;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person p = new Person("Alice", "123 St", "12345678", "alice@example.com");
        Student s = new Student("Bob", "456 Ave", "87654321", "bob@example.com", Student.SOPHOMORE);
        MyDate hireDate = new MyDate(1, 4, 2020);
        Employee e = new Employee("Carol", "789 Rd", "00000000", "carol@example.com", "A101", 5000, hireDate);
        Faculty f = new Faculty("Dave", "135 Ln", "99999999", "dave@example.com", "B202", 7000, hireDate, 10, "Professor");
        Staff st = new Staff("Eve", "246 Dr", "88888888", "eve@example.com", "C303", 4000, hireDate, "Administrator");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}
