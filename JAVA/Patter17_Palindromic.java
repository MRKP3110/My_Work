import java.util.*;

public class Patter17_Palindromic {
 public static void main(String args[]){

    int n=5;
    for(int i=1; i<=n; i++){
        for(int space=1; space<=n-i; space++){
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
 }   
}
