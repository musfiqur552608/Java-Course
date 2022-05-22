package helloworld;

public class OppDemo {
   static void myMethod(int a, int b, int c){
       int sum = a+b+c;
       System.out.println(sum);
   }
   
    public static void main(String[] args) {
        myMethod(10, 5, 15);
        myMethod(15,20,30);
    }
}
