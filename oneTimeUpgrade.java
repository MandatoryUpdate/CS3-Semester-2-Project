import mayflower.*;
public class oneTimeUpgrade extends Actor
{
    private boolean bought;
    private boolean unlocked;
    private int cost;
    private double multiplierVal;
    
    public oneTimeUpgrade(){
        boolean bought = false;
        boolean unlocked = false;
        double multiplierVal = 1;
    }
    public int getCost()
    {
        return cost;
    }
    public void act(){
        
    }
    public void addMultiplier(int i){
        multiplierVal+=i;
    }
}
