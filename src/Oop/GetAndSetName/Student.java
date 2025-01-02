package Oop.GetAndSetName;

public class Student {
    private  String  name;

    public void setName(String name) {
        System.out.println("Setting name");
        this.name = name;
    }

    public String getName() {
        System.out.println("Getting name");
        return this.name;
    }
}
