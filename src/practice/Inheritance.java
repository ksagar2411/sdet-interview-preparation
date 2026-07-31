package practice;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();  // OK — Animal referencing Animal
        a1.makeSound();            // prints: Some sound

        Animal a2 = new Dog();     // OK — Animal referencing Dog (upcast, always safe)
        a2.makeSound();            // prints: Bark

        Animal a3 = new Cat();     // OK — Animal referencing Cat (Cat extends Animal)
        a3.makeSound();            // prints: Meow

        Dog d1 = new Dog();        // OK — Dog referencing Dog
        d1.makeSound();            // prints: Bark

        //Dog d2 = new Animal();     // COMPILE ERROR — Dog cannot reference plain Animal
        // error: incompatible types: Animal cannot be converted to Dog
    }
}