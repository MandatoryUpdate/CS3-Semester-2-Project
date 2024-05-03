import mayflower.*;
public class Rice extends Actor
{
    private int riceCounter = 0;
    private int clickValue = 1;
    public Rice()
    {
        setImage(new MayflowerImage("img/click.png"));
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
