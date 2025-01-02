package basics.flowcontrole;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
//        Write a Java program that uses a switch statement to:
//
//        Take an integer input representing the day of the week (1 for Monday, 2 for Tuesday, etc.).
//        Print the name of the corresponding day.
//                If the input is not between 1 and 7, print "Invalid day."

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the day: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid number:");
                break;

        }
    }
}
