public class Static_Operato {
    
    public static void main(String args[])   // ststic keyword is used for give one value to all function 
    {
      test t1 = new test();
      test t2 = new test();
      test t3 = new test();
      test t4 = new test();
      t1.show();
      t2.show();
      t3.show();
      t4.show();
    }
}

class test
{
    static int a = 5;
    void show ()
    {
       a++;
       System.out.println("value:"+a);
    }
}
