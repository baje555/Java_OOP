package Oop.Polymorphism.AreaOfRectangleAndSquare;

public class Area {
    void computeArea(double length , double breadth){
        System.out.println("The area of rectangle is:"+length*breadth);
    }
    void computeArea(double length){
        System.out.println("The area of square "+length*length);
    }
}
