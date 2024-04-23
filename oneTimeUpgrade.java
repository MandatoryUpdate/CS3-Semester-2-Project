import mayflower.*;
public class oneTimeUpgrade extends Actor
{
    private boolean bought;
    private boolean unlocked;
    private double multiplierVal;
    
    public oneTimeUpgrade(){
        boolean bought = false;
        boolean unlocked = false;
        double multiplierVal = 1;
    }
    public void act(){
        
    }
    public void addMultiplier(int i){
        multiplierVal+=i;
    }
}
