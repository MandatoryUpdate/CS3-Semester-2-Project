import mayflower.*;
public class Rice extends Actor
{
    private int riceCounter = 0;
    private int clickValue = 1;
    public Rice()
    {
        setImage(new MayflowerImage("Curry Pictures/383.jpg"));
    }
    public int getRiceCounter()
    {
        return riceCounter;
    }
    public void act(){
        if (Mayflower.mouseClicked(this)){
            riceCounter += clickValue;
        }
    }
}
