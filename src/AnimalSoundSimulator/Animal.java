package AnimalSoundSimulator;
abstract class Animal {


    abstract void  makeSound();

    void eat(){
        System.out.println("Animal is eating!");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bhau Bhau");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow Meow");
    }
}
class Cow extends Animal{
    void makeSound(){
        System.out.println("Mooooo");
    }
}
