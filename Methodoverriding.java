//write a program in java to demonstrate method overriding

// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    
    public void move() {
        System.out.println("Animal is moving");
    }
}

// Child class 1 - Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
    
    @Override
    public void move() {
        System.out.println("Dog runs on four legs");
    }
}

// Child class 2 - Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow");
    }
    
    @Override
    public void move() {
        System.out.println("Cat walks silently");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        // Create objects of different classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Demonstrate method overriding
        System.out.println("--- Animal Sounds and Movement ---");
        animal.sound();
        animal.move();
        
        System.out.println("\n--- Dog Sounds and Movement ---");
        dog.sound();
        dog.move();
        
        System.out.println("\n--- Cat Sounds and Movement ---");
        cat.sound();
        cat.move();
        
        // Demonstrate polymorphism with method overriding
        System.out.println("\n--- Polymorphic Behavior ---");
        Animal[] animals = {animal, dog, cat};
        for (Animal a : animals) {
            a.sound();
            a.move();
            System.out.println();
        }
    }
}

