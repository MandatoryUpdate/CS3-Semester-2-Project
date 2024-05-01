import mayflower.*;

public class soysauce extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public soysauce()
    {
        MayflowerImage p = new MayflowerImage ("img/SoySauce.png");
        p.scale(200,200);
        setImage(p);
        cost = 1;
        multiplier = 1.5;
    }
    public int getCost()
    {
        return cost;
    }
    public boolean getBought()
    {
        return bought;        
    }
    public double getMultiplier(){
        return multiplier;
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/SoySauce2.png");
            p2.scale(200,200);
            setImage(p2);
            bought = true;
        }
    }
}
