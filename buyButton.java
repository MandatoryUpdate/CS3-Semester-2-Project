import mayflower.*;
public class buyButton extends Actor
{
    public buyButton()
    {
        
    }
    public void checkClicked(int val)
    {
        if(val == 1)
        {
            MayflowerImage p = new MayflowerImage ("img/buy.png");
            p.scale(250,250);
            setImage(new MayflowerImage(p));
        }
        else if(val == 2)
        {
            MayflowerImage p2 = new MayflowerImage ("img/buy2.png");
            p2.scale(250,250);
            setImage(new MayflowerImage(p2));
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
