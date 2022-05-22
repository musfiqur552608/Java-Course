
package accessmodifierdemo;

public class PrivateDemo {
    String fname = "Musfiqur";
    private String lname = "Rahman";
    private String email = "musfiq@dipti.com.bd";
    private int age = 23;
    
    public static void main(String[] args) {
        PrivateDemo obj1 = new PrivateDemo();
        
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Email: "+obj1.email);
        System.out.println("Age: "+obj1.age);
    }
    
}
