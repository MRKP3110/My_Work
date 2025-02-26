public class This_Keyword {
    public static void main(String args[])         // This operator  prority sequence : 1 - object values
    {                                              //                                   2 - Global value
         test t1 = new test();                      //                                  3 - Local value
         t1.a = 20; // Object value
         t1.show();
    }
}

class test
{
    int a = 15; // Global value
    void show()
    {
        int a = 30 ; // Local values
        System.out.println("value:"+this.a);
    }
}
