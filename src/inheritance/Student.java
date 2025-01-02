package inheritance;

public class Student extends Person {
    void displayInfo(){
        System.out.println("I am a student.");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Employee e1 = new Employee();
        s1.displayInfo();
        e1.displayInfo();
    }

}
