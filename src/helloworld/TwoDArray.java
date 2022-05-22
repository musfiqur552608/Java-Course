
package helloworld;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(num[2][0]);
        Scanner a = new Scanner(System.in);   
        int num[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                num[i][j] = a.nextInt();
            }
        }

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
    }
}
