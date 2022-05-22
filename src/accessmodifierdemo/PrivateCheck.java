
package accessmodifierdemo;

public class PrivateCheck {
    public static void main(String[] args) {
        PrivateDemo obj1 = new PrivateDemo();
        
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Email: "+obj1.email);
        System.out.println("Age: "+obj1.age);
    }
}
