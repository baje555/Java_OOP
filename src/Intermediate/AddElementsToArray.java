package Intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElementsToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Harry");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name1 = sc.next();
        names.add(1,name1);
        System.out.println(names);
    }
}
