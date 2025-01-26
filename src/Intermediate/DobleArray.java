package Intermediate;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class DobleArray {


    public static void main(String[] args) {
        ArrayList <Double> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 inputs");
        double num1 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num2 = sc.nextDouble();


        numbers.add(0,num1);
        numbers.add(1,num2);
        numbers.add(2,num3);
        numbers.add(3,num4);

        for (int i = 0; i <= 3; ++i){
            System.out.println(numbers.get(2));
        }
    }
}
