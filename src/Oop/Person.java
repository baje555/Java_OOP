package Oop;

import java.util.Scanner;

public class Person {
    private String name;

    public String getName() {

        return this.name;
    }
    public void setName(String name){
    this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
String name = sc.next();
person1.setName(name);

        System.out.println(person1.getName());
    }
}
