
package accessmodifierdemo;

public class ProtectedDemo {
    protected String fname = "Musfiqur";
    protected String lname = "Rahman";
    protected String email = "musfiq@dipti.com.bd";
    protected int age = 23;
    
    public static void main(String[] args) {
        ProtectedDemo obj1 = new ProtectedDemo();
        
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Email: "+obj1.email);
        System.out.println("Age: "+obj1.age);
    }
}
