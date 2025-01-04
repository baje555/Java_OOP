package Oop.Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        LocalGreeting l1 = new LocalGreeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc . next();
        g1.greet(name);
        l1.greet(name);
    }
}
