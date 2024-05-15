import mayflower.*;
import java.lang.Math;
public class riceGrain extends Actor
{
    int timeOut = 3500;
    boolean onOffState = false;
    public riceGrain()
    {
        //Set image here
    }
    public boolean chooseAdd()
    {
        int currentVal = (int)(Math.random() * 10000) + 1;
        if(currentVal > 9000)
            return true;
        return false;
    }
    public void act()
    {
        if(!onOffState)
        {
            chooseAdd();
        }
        if(onOffState)
        {
            int x = (int)(Math.random() * 770);
            int y = (int)(Math.random() * 670);
            getWorld().addObject(this, x, y);
        }
        if(onOffState == true && timeOut > 0)
            timeOut--;
        checkRemove();
    }
    public void checkRemove()
    {
        int range = (int)(Math.random() * .15);
        if(Mayflower.mouseClicked(this))
        {
            MyWorld myWorld = new MyWorld();
            myWorld.addStuff(myWorld.getTotal() * range);
            getWorld().removeObject(this);
            onOffState = false;
            timeOut = 3500;
        }
        if(onOffState == true && timeOut == 0)
        {
            getWorld().removeObject(this);
            onOffState = false;
            timeOut = 3500;
        }
    }
}
