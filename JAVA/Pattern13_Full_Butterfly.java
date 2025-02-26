// Full Butterfly Pattern

import java.util.*;

public class Pattern13_Full_Butterfly {
    public static void main(String args[]){
        
        int n = 4;

        // Upper Half

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
                }
            
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces; j++){
                System.out.print(" ");
                }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Lower Half

        for(int i=n; i>=1 ; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
                }
            
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces; j++){
                System.out.print(" ");
                }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
           
    }
}    

