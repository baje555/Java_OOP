package Oop.DataHiding;

import java.util.Scanner;

public class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Person p1 = new Person();
        p1.setAge(age);
        System.out.println(p1.getAge());
    }
}
