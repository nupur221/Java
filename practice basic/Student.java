import java.util.Scanner;
import java.util.Arrays;
public class Student {
     int id;
     static String name;
     String department;
     double cgpa;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String toString() {
        return "\n Name: " + name + "\n ID: " + id +  "\n Department: " + department +  "\n CGPA: " + cgpa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the information of student " + (i + 1) + ":");
            
            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Department: ");
            String department = scanner.next();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student( id, name, department, cgpa);
        }

        scanner.close();

        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getCGPA(), s1.getCGPA()));

        System.out.println("Second maximum CGPA student: " + students[1]);
    }
}

