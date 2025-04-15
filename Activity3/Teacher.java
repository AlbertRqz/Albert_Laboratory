package Activity3;
class Teacher extends Person {
    String subject;

    // Constructor to initialize name, id, and subject
    public Teacher(String name, int id, String subject) {
        super(name, id); // Calling the parent class constructor
        this.subject = subject;
    }

    // Overriding the displayInfo method to include subject
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Subject: " + subject);
    }
}