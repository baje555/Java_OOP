package Intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class AccessElementFromArraylist {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("John");
        names.add("Harry");
        names.add("Niall");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an index");
        int index = sc.nextInt();
        String elements = names.get(index);
        System.out.println("At index "+index+" is "+elements);
        System.out.println("Enter a name");
        String name1 = sc.next();
        names.add(index,name1);

        System.out.println(names);
    }
}
