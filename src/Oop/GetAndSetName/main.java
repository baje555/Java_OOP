package Oop.GetAndSetName;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        Student st = new Student();
        st.setName(name);
        System.out.println(st.getName()
);
    }
}
