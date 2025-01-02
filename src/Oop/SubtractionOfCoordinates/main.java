package Oop.SubtractionOfCoordinates;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 coordinates: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Coordinate c1 = new Coordinate(x1,y1);
        Coordinate c2 = new Coordinate(x2,y2);

        int xDiff = c1.x- c2.x;
        int yDiff = c1.y - c2.y;
        System.out.println(xDiff);
        System.out.println(yDiff);
    }
}
