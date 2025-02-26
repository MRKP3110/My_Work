// Inverted Half Pyramid(rotated by 180 deg)

import java.util.*;

public class Pattern7 {

    public static void main(String args[]){
        int n =4;

        for(int i = 1 ; i<=n ; i++){
            //inner loop -> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
