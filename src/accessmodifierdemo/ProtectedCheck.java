
package accessmodifierdemo;

public class ProtectedCheck{
    public static void main(String[] args) {
        ProtectedDemo obj1 = new ProtectedDemo();
        
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Email: "+obj1.email);
        System.out.println("Age: "+obj1.age);
    }
}
