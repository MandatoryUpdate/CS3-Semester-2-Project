import mayflower.*;

public class curry extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public curry()
    {
        MayflowerImage p = new MayflowerImage ("img/Curry.png");
        p.scale(80,80);
        setImage(p);
        cost = 30;
    }
    public int getCost()
    {
        return cost;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Curry2.png");
            p2.scale(80,80);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}

