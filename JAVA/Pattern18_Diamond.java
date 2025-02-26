import java.util.*;

public class Pattern18_Diamond {
    public static void main(String args[]){

        int n=4;

        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n ; i>=1; i--){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
