package Oop.AreaOfRectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Rectangle r = new Rectangle(x,y);
        r.calculateArea();

    }
}
