import mayflower.*;

public class chives extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public chives()
    {
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(80,80);
        setImage(p);
        cost = 20;
    }
    public int getCost()
    {
        return cost;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Chives2.png");
            p2.scale(80,80);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}
