import mayflower.*;

public class chives extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public chives()
    {
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(80,80);
        setImage(p);
        cost = 1;
        multiplier = 1.5;
    }
    public int getCost()
    {
        return cost;
    }
    public double getMultiplier(){
        return multiplier;
    }
    public boolean getBought()
    {
        return bought;        
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Chives2.png");
            p2.scale(80,80);
            setImage(p2);
            bought = true;
        }
    }
}
