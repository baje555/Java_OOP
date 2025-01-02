package Oop;

public class StudentInfo {
    String name;
    int num;
    StudentInfo(String name, int num){
        this.name=name;
        this.num=num;

    }

    public static void main(String[] args) {
        StudentInfo si = new StudentInfo("Pankaj kshteri",12);
        System.out.println("Student 1 name is:"+si.name);
        System.out.println("Student 1 score is:"+si.num);
        StudentInfo si1 = new StudentInfo("Samipya khuncha",2);
        System.out.println("Student 2 name is:"+si1.name);
        System.out.println("Student 2 score is:"+si1.num);
    }
}
