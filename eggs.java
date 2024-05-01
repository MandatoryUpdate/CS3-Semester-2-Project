import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    MyWorld myWorld = (MyWorld)getWorld();
    double total = myWorld.getTotal();
    public eggs()
    {
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(200,200);
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
            MayflowerImage p2 = new MayflowerImage ("img/Egg2.png");
            p2.scale(200,200);
            setImage(p2);
            bought = true;
        }
    }
}
