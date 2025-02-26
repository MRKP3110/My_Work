// print patterns with taking input from user .(nested loop)

import java.util.*;

public class Pattern3 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        int m = sc1.nextInt();

        for ( int i =1 ; i<=n ; i++){
            for (int j = 1; j<=m ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
