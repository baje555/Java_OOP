package Intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");
        Scanner sc = new Scanner(System.in);
        System.out.println("Before removing : "+names);
        System.out.println("enter a number");
        int index = sc.nextInt();
        names.remove(index);
        System.out.println("After removing: "+names);
    }
}
