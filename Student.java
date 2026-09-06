public class Student {
    int rollNumber;
    String name;
    String department;
    int marks;

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNumber = 101;
        s1.name = "Keerthi";
        s1.department = "ECE";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollNumber = 102;
        s2.name = "Anu";
        s2.department = "ECE";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNumber = 103;
        s3.name = "Priya";
        s3.department = "ECE";
        s3.marks = 88;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
