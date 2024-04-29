import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public eggs()
    {
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(200,200);
        setImage(p);
        cost = 100;
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
            MayflowerImage p2 = new MayflowerImage ("img/Egg2.png");
            p2.scale(200,200);
            setImage(p2);
        }
    }
}
