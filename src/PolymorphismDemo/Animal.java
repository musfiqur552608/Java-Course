
package PolymorphismDemo;

public class Animal {
    public void animalSound(){
        System.out.println("The animal make a sound");
    }
}

class Caw extends Animal{
    public void animalSound(){
        System.out.println("Humbba......");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bau......");
    }
}

class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCaw = new Caw();
        Animal myDog = new Dog();
        
        myAnimal.animalSound();
        myCaw.animalSound();
        myDog.animalSound();
        
    }
}
