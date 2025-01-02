package Oop;

import java.util.Scanner;
class Student{
    int score;
    char grade;

    Student(int score){
        this.score = score;
    }

    char assignGrade(){
        if(score>90){
            grade = 'A';
        }
        else if(score>=80){
            grade = 'B';
        }
        else{
            grade = 'C';
        }
return grade;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();
        Student student = new Student(score);
        student.assignGrade();
        System.out.println(student.grade);
    }
}
