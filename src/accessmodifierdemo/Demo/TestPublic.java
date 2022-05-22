
package accessmodifierdemo.Demo;

import accessmodifierdemo.AccessModifierDemo;

public class TestPublic {
    public static void main(String[] args) {
        AccessModifierDemo obj1 = new AccessModifierDemo();
        
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Email: "+obj1.email);
        System.out.println("Age: "+obj1.age);
    }
}
