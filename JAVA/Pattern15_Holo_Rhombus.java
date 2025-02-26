import java.util.*;

public class Pattern15_Holo_Rhombus {
    
    public static void main(String args[]){

        int n =5;
        int m =9;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if( i==n || j==m ||  j==1 || i==1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
