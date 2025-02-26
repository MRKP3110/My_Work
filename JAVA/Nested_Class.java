public class Nested_Class {
    
        public static  void main(String args[])
        {
          test t1 =  new test();
          t1.show();
          test.inner i = new test ().new inner();
          i.disp();
        }
}

class test 
{
     void show()
     {
    System.out .println("This is Show function");
     }
    class inner 
    {
     void disp()
     {
        System.out.println("This is disp function");
     }
    }
}
