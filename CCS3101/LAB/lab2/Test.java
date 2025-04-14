class Student {
    private String name;
    private Course[] courseList;
    private int courseCount;

    public Student(String name) {
        this.name = name;
        this.courseList = new Course[10]; 
        this.courseCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course c) {
        if (!isCourseAdded(c) && courseCount < 10) {
            courseList[courseCount++] = c;
            c.addStudent(this); // keeping the relationship consistent
        }
    }

    private boolean isCourseAdded(Course c) {
        for (int i = 0; i < courseCount; i++) {
            if (courseList[i] == c) {
                return true;
            }
        }
        return false;
    }

    public void printCourses() {
        System.out.println(name + " is taking:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courseList[i].getName());
        }
    }
}

class Course {
    private String name;
    private Student[] classList;
    private int studentCount;

    public Course(String name) {
        this.name = name;
        this.classList = new Student[10]; 
        this.studentCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        if (!isStudentAdded(s) && studentCount < 10) {
            classList[studentCount++] = s;
            s.addCourse(this); // keeping the relationship consistent
        }
    }

    private boolean isStudentAdded(Student s) {
        for (int i = 0; i < studentCount; i++) {
            if (classList[i] == s) {
                return true;
            }
        }
        return false;
    }

    public void printStudents() {
        System.out.println("Students in " + name + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + classList[i].getName());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // create students
        Student peter = new Student("Peter Jones");
        Student kim = new Student("Kim Smith");

        //create courses
        Course dataStructures = new Course("Data Structures");
        Course databaseSystems = new Course("Database Systems");

        // add courses to students
        dataStructures.addStudent(peter);
        dataStructures.addStudent(kim);
        databaseSystems.addStudent(kim);

        // print students and courses
        peter.printCourses();
        kim.printCourses();

        // print students in each course
        dataStructures.printStudents();
        databaseSystems.printStudents();
    }
}