package AnimalSoundSimulator;

public class main {
    public static void main(String[] args) {
        Animal newDog = new Dog();
        Animal newCat = new Cat();
        Animal newCow = new Cow();
        newDog.makeSound();
        newDog.eat();
        newCat.makeSound();
        newCat.eat();
        newCow.makeSound();
        newCow.eat();
    }
}
