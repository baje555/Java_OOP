package Intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifyElements {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name:");
        String name1 = sc.next();
        names.set(1,name1);
        System.out.println(names);
    }
}
