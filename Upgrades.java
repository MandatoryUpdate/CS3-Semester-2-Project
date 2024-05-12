import mayflower.*;
public class Upgrades extends Actor{
    private int buildings;
    private int production;
    private int cost;
    private int ActualTimer;
    public Upgrades(){
        buildings = 0;
        production = 0;
        cost = 0;
        ActualTimer = 0;
    }
    public Upgrades(int b, int p, int c, int t){
        buildings = b;
        production = p;
        cost = c;
        ActualTimer = t;
    }
    public void checkBuildings(){
        MyWorld myWorld = (MyWorld)getWorld();
        if(myWorld.getState() == 1)
        {
            if(Mayflower.mouseClicked(this) && myWorld.getTotal() > cost)
            {
                myWorld.subtractCost(cost);
                buildings++;
            }
        }
        else if(myWorld.getState() == 2)
        {
            if(Mayflower.mouseClicked(this) && buildings > 0)
            {
                myWorld.addStuff(cost);
                buildings--;
            }
        }
    }
    public void act(){
        int timer = ActualTimer;
        MyWorld myWorld = (MyWorld)getWorld();
        checkBuildings();
        timer--;
        if(timer <= 0){
            myWorld.addStuff(buildings*production);
            timer = ActualTimer;
        }
    }
}

