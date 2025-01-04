package Oop.UseAbstractMethodsOfAnInterface;

import java.util.Scanner;

class Triangle implements Polygon {

     public void getArea(int height, int base) {

         double Area = 0.5*  base*  height;

         System.out.println("The area is: "+Area);
    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height and base:");

        int height = sc.nextInt();
        int base = sc.nextInt();

        obj.getArea(height, base);
    }
}
