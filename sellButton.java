
import mayflower.*;
public class sellButton extends Actor
{
    public sellButton()
    {
        //MayflowerImage p1 = new MayflowerImage ((insert default sellButton here));
    }
    public void checkClicked(int val)
    {
        if(val == 1)
        {
            //setImage((blacked out sellButton here))
        }
        else if(val == 2)
        {
            //setImage((default sellButton here))
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
