
package InterfaceDemo;

interface Animal {
    public void animalSound();
    public void sleep();
}

class Caw implements Animal{
    public void animalSound(){
        System.out.println("Hambah.......");
    }
    
    public void sleep(){
        System.out.println("Zzzzz");
    }
}

class Main{
    public static void main(String[] args) {
        Caw myCaw = new Caw();
        myCaw.animalSound();
        myCaw.sleep();
    }
}
