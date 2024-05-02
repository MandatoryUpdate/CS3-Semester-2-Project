import mayflower.*;

public class tofu extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public tofu()
    {
        MayflowerImage p = new MayflowerImage ("img/tofu.png");
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
            MayflowerImage p2 = new MayflowerImage ("img/tofu2.png");
            p2.scale(80,80);
            setImage(p2);
            bought = true;
        }
    }
}
