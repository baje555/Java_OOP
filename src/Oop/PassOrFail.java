package Oop;

public class PassOrFail {
    String name;
    int num;
    PassOrFail(String name, int num){
        this.name = name;
        this.num = num;

    }
    void check(){
        if (num > 30){
            System.out.println(name+" Passed!");
        }
        else {
            System.out.println(name+" Failed!");
        }
    }

    public static void main(String[] args) {
        PassOrFail stu = new PassOrFail("Pankaj",39);
        PassOrFail stu2 = new PassOrFail("Samipya",12);

        stu.check();
        stu2.check();
    }
}
