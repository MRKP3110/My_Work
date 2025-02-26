// print the table of a given number input by user.

//  do{
//      do somthing
//    }(condition);

import java.util.*;

public class Loop_Do_While1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        do{
            System.out.println(i*n);
            i++;
        }while(i<=10);
    }
}
