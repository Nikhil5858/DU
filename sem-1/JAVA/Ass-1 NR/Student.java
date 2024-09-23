public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student object created");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create Student objects using constructor
        Student s1 = new Student("ABC", 20);
        Student s2 = new Student("XYZ", 22);

        // Display student details
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
