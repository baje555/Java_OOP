package basics.flowcontrole;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
//        Create a program that uses a switch statement to:
//
//        Take a character input (+, -, *, /).
//        Perform the corresponding arithmetic operation on two numbers provided by the user.
//        Print the result.

Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Arithametic operation:");
        char res=sc.next().charAt(0);
        int op;

        switch (res){
            case '+':
                op = num1+num2;
                System.out.println("The sum is :"+op);
                break;
            case '-':
                op = num1-num2;
                System.out.println("The minus is :"+op);
                break;
            case '*':
                op = num1*num2;
                System.out.println("The multiplication is :"+op);
                break;
            case '/':
                op = num1/num2;
                System.out.println("The division is :"+op);
                break;

            default:
                System.out.println("Invalid input");

        }
    }
}
