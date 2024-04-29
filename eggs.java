import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public eggs()
    {
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(50,50);
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
            MayflowerImage p2 = new MayflowerImage ("img/Egg2.png");
            p2.scale(50,50);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}
