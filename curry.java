import mayflower.*;

public class curry extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multipler;
    public curry()
    {
        MayflowerImage p = new MayflowerImage ("img/Curry.png");
        p.scale(80,80);
        setImage(p);
        cost = 1;
        multipler = 1.5;
    }
    public int getCost()
    {
        return cost;
    }
    public double getMultiplier(){
        return multipler;
    }
    public boolean getBought()
    {
        return bought;        
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Curry2.png");
            p2.scale(80,80);
            setImage(p2);
            bought = true;
        }
    }
}
