//print the table of a given number input by user.

import java.util.*;

public class Loop_For5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=0;
        for(i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
