package Oop.AbstractAnimal;

abstract public class Animal {
    abstract void makeSound();

}
  class Dog extends Animal{
    void makeSound(){
        System.out.println("Woof woof");
    }

public static void main(String[] args) {
    Dog d = new Dog();
    d.makeSound();
}
}
