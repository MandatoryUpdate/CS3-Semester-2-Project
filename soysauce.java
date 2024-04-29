import mayflower.*;

public class soysauce extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    public soysauce()
    {
        MayflowerImage p = new MayflowerImage ("img/SoySauce.png");
        p.scale(200,200);
        setImage(p);
        cost = 5000;
    }
    public int getCost()
    {
        return cost;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/SoySauce2.png");
            p2.scale(200,200);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}
