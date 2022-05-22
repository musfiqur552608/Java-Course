
package helloworld;

public class MethodDemo {
    static void myMethod(String fname, int age){
        System.out.println(fname+" is "+age);
    }
    
    public static void main(String[] args) {
        myMethod("Musfiq", 23);
        myMethod("Sakib", 19);
    }
}
