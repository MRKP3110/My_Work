// print the table of a given number input by user.

import java.util.*;

public class Loop_For4 {

    public static void main( String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1 ; i<=10 ; i++){

            sum = n*i;
            System.out.println(sum);
        }
        
    }
}
