package Activity3;

public class Student extends Person {
    String gradeLevel;

    // Constructor to initialize name, id, and gradeLevel
    public Student(String name, int id, String gradeLevel) {
        super(name, id); // Calling the parent class constructor
        this.gradeLevel = gradeLevel;
    }

    // Overriding the displayInfo method to include gradeLevel
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Grade Level: " + gradeLevel);
    }
}