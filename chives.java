import mayflower.*;

public class chives extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public chives()
    {
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(200,200);
        setImage(p);
        cost = 110;
        multiplier = 1.5;
    }
    public int getCost()
    {
        return cost;
    }
    public double getMultiplier()
    {
        return multiplier;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Chives2.png");
            p2.scale(200,200);
            setImage(p2);
        }
    }
}
