package Activity3;

import java.util.Scanner;

class Person {
    private String name; 
    private int id;      

    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
     class SchoolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student's ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Student's Grade Level: ");
        String gradeLevel = scanner.nextLine();
        Student student = new Student(studentName, studentId, gradeLevel);
        
        
        System.out.print("Enter Teacher's Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Teacher's ID: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Teacher's Subject: ");
        String subject = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherId, subject);
        
        
        System.out.print("Enter Staff's Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Enter Staff's ID: ");
        int staffId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Staff's Department: ");
        String department = scanner.nextLine();
        Staff staff = new Staff(staffName, staffId, department);

        
        System.out.println("\nStudent Information:");
        student.displayInfo();
        System.out.println("\nTeacher Information:");
        teacher.displayInfo();
        System.out.println("\nStaff Information:");
        staff.displayInfo();
        
        scanner.close();
    }
    }
}