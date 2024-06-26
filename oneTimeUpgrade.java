import mayflower.*;
public class oneTimeUpgrade extends Actor
{
    private boolean bought;
    private int cost;
    private double multiplier;
    private String name;
    public oneTimeUpgrade(){
        bought = false;
        multiplier = 0;
        cost = 0;
    }
    public oneTimeUpgrade(boolean b, int c, double m, String n){
        bought = b;
        multiplier = m;
        cost = c;
        name = n;
    }
    public int getCost()
    {
        return cost;
    }
    public boolean getBought()
    {
        return bought;        
    }
    public void act(){
        MyWorld myWorld = (MyWorld)getWorld();
        if(Mayflower.mouseClicked(this) && myWorld.getTotal() > cost){
            myWorld.subtractCost(cost);
            MayflowerImage p2 = new MayflowerImage ("img/"+name+"2.png");
            p2.scale(80,80);
            setImage(p2);
            bought = true;
        }
        
    }
    public double getMultiplier(){
        return multiplier;
    }
}
