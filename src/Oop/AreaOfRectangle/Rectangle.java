package Oop.AreaOfRectangle;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int x , int y){
       this.length = x;
       this.breadth = y;

    }
    void calculateArea(){
        int area = length * breadth;
        System.out.println(area);
    }
}

