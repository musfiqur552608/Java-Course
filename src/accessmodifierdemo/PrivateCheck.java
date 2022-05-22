
package accessmodifierdemo;

public class PrivateCheck {
    public static void main(String[] args) {
        PrivateDemo obj1 = new PrivateDemo();
        
        obj1.setFname("Sakibur");
        obj1.setLname("Rahman");
        obj1.setAge(19);
        obj1.setEmail("sakib@gmail.com");
        
        System.out.println("Name: "+obj1.getFname()+" "+obj1.getLname());
        System.out.println("Email: "+obj1.getEmail());
        System.out.println("Age: "+obj1.getAge());
    }
}
