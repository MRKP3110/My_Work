public  class Largest {
    public static void main(String args[])
    {
        int A = 23;
        int B = 56;
        int C = 65;
        
        if ( A>B && A>C){
            System.out.println(A+ "is Largest");
        }
        else if ( B>A && B>C ){
            System.out.println(B+  "is Largest");
        }
        else{
            System.out.println(C+ "is Largest");
        } 

    }
}
