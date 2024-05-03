import mayflower.*;
public class Rice extends Actor
{
    private int riceCounter = 0;
    private int clickValue = 1;
    public Rice()
    {
        MayflowerImage p = new MayflowerImage ("img/click.png");
        p.scale(250,250);
        setImage(new MayflowerImage(p));
    }
    public int getRiceCounter()
    {
        if (Mayflower.mouseClicked(this)){
            return clickValue;
        }
        return 0;
    }
    public void act(){
    
    }
}
