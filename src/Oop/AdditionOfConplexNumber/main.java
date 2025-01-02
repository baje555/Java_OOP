package Oop.AdditionOfConplexNumber;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 double inputs: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        ComplexNumber c1 = new ComplexNumber(n1,n2);
        ComplexNumber c2 = new ComplexNumber(n3,n4);
        double realSum = c1.real+ c2.real;
        double imagSum = c1.imag+ c2.imag;
        System.out.println(realSum+" + "+imagSum+"i");


    }
}
