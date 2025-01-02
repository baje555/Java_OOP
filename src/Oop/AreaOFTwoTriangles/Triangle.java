package Oop.AreaOFTwoTriangles;

public class Triangle {
    int base;
    int height;

    Triangle(int b, int h){
        this.base = b;
        this.height = h;
    }
    void calculateArea(){
        int area = (base * height) /2;
        System.out.println(area);
    }
}
