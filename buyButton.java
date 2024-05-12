import mayflower.*;
public class buyButton extends Actor
{
    public buyButton()
    {
        //MayflowerImage p1 = new MayflowerImage ((insert default buyButton here));
    }
    public void checkClicked(int val)
    {
        if(val == 1)
        {
            //setImage((default buyButton here))
        }
        else if(val == 2)
        {
            //setImage((blacked out buyButton here))
        }
    }
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        if(Mayflower.mouseClicked(this))
        {
            myWorld.setState(1);
        }
        checkClicked(myWorld.getState());
    }
}
