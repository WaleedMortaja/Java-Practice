/*
P3.4 A microwave control panel has four buttons: one for increasing the time by 30
seconds, one for switching between power levels 1 and 2, a reset button, and a start
button. Implement a class that simulates the microwave, with a method for each button.
The method for the start button should print a message “Cooking for ... seconds
at level ...”.
*/

public class P4_Microwave
{
    private int time;
    private byte powerLevel;
    
    /**
     * Constructor for objects of class P4_Microwave
     */
    public Microwave()
    {time =0;
     powerLevel=1;
    }
    
    public void increaseTime()
    {
        time+=30;
    }
    
    public void switchLevel()
    {
        if (powerLevel==1)
        {
            powerLevel=2;
        }
        else
        {
            powerLevel=1;
        }
    }
    
    public void reset()
    {
        time=0;
        powerLevel =1 ;  
}
  public void start()
    {
        System.out.println("Cooking for "+ time + "  seconds at level "+powerLevel);
        time=0;
        powerLevel=1;
    }
}
