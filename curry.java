import mayflower.*;

public class curry extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public curry()
    {
        MayflowerImage p = new MayflowerImage ("img/Curry.png");
        p.scale(200,200);
        setImage(p);
        cost = 20;
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
            MayflowerImage p2 = new MayflowerImage ("img/Curry2.png");
            p2.scale(200,200);
            setImage(p2);
        }
    }
}

