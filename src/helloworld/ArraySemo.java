
package helloworld;

public class ArraySemo {
    public static void main(String[] args) {
        String cars[] = {"Volvo","BMW","Ford","Mazda"};
        
        System.out.println(cars.length);
        
//        int i;
//        for(i = 0; i<cars.length; i++){
//            System.out.println(cars[i]);//Volvo,BMW,Ford,Mazda
//        }
        for(String i : cars){
            System.out.println(i);
        }
        
    }
}
