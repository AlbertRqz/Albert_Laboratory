package Activity3;
class Staff extends Person {
    String department;

    // Constructor to initialize name, id, and department
    public Staff(String name, int id, String department) {
        super(name, id); // Calling the parent class constructor
        this.department = department;
    }

    // Overriding the displayInfo method to include department
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent class method
        System.out.println("Department: " + department);
    }
}