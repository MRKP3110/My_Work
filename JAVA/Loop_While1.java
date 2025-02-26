// print the table of a given number input by user.

//  while(condition){
//   do somthing
//    }

import java.util.*;

public class Loop_While1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while(i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}
