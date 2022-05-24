
package InheritanceDemo;

public class Vehicle {
    protected String brand = "Frod";
    public void honk(){
        System.out.println("Booooooooo!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";
    
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.honk();
        
        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}