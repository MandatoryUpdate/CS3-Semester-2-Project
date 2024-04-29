import mayflower.*;

public class paneer extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public paneer()
    {
        MayflowerImage p = new MayflowerImage ("img/Paneer.png");
        p.scale(200,200);
        setImage(p);
        cost = 100000;
    }
    public int getCost()
    {
        return cost;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Paneer2.png");
            p2.scale(200,200);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}
