/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClassDemo;

/**
 *
 * @author TEACHER PC
 */
abstract class Animal {
    public abstract void animalSound();
    
    public void sleep(){
        System.out.println("Zzzzz");
    }
}

class Caw extends Animal{
    public void animalSound(){
        System.out.println("Hambha.....");
    }
}


class Main{
    public static void main(String[] args) {
        Caw myCaw = new Caw();
        myCaw.animalSound();
        myCaw.sleep();
    }
}