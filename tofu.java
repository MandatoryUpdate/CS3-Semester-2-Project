import mayflower.*;

public class tofu extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public tofu()
    {
        MayflowerImage p = new MayflowerImage ("img/tofu.png");
        p.scale(200,200);
        setImage(p);
        cost = 10;
    }
    public int getCost()
    {
        return cost;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/tofu2.png");
            p2.scale(200,200);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}
