import mayflower.*;

public class paneer extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public paneer()
    {
        MayflowerImage p = new MayflowerImage ("img/Paneer.png");
        p.scale(200,200);
        setImage(p);
        cost = 100000;
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
            MayflowerImage p2 = new MayflowerImage ("img/Paneer2.png");
            p2.scale(200,200);
            setImage(p2);
        }
    }
}
