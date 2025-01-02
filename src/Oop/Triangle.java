package Oop;

import java.util.Scanner;

public class Triangle {
    int base,height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }


    double calculateArea(){
        double area = 1.0 / 2.0 *( this.base * this.height);
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height:");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Triangle t = new Triangle(base,height);
        double area = t.calculateArea();
        System.out.println(area);

    }
}
