
package helloworld;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(" "+ a[i][j]);//1,2,3,4 //5,6,7,8//9,10,11,12
            }
            System.out.println();
        }
    } 
}
