
import mayflower.*;
public class sellButton extends Actor
{
    public sellButton()
    {
    }
    public void checkClicked(int val)
    {
        if(val == 1)
        {
            MayflowerImage p = new MayflowerImage ("img/sell.png");
            p.scale(100,100);
            setImage(new MayflowerImage(p));
        }
        else if(val == 2)
        {
            MayflowerImage p2 = new MayflowerImage ("img/sell2.png");
            p2.scale(100,100);
            setImage(new MayflowerImage(p2));
        }
    }
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        if(Mayflower.mouseClicked(this))
        {
            myWorld.setState(2);
        }
        checkClicked(myWorld.getState());
    }
}
