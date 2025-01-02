package Oop;

import java.util.Scanner;

public class grade {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        grade g = new grade();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks:");
        int num = sc.nextInt();
        g.setNum(num);
        System.out.println(g.getNum());
    }
}

