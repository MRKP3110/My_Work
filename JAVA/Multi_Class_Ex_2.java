public class Multi_Class_Ex_2 {

    public static void main(String args[])
    {
       demo d1 = new demo();
       d1.show();

    }
    
}

class demo
{
    final int a = 20; //Global veriable
    void show()
    
    {
         int a =15 , b=10 ;  //Local veriable 
        
        System.out.println("" +(a+b));
    }
}
