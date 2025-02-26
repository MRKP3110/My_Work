public class Multi_Class_Ex_3 {
       public static void main(String args[])
       {
         lemp l1 = new lemp();
         l1.turnon();

         lemp l2 = new lemp();
         l2.turnoff();
       }    
}

class lemp 
{
    boolean isOn;
    boolean isOff;
    void turnon()
    {
         isOn = true;
        System.out.println("Light on:" + isOn);

  
    }

    void turnoff()
    {
        isOff = false;
        System.out.println("Light off:"+isOff);
        
    }
}
