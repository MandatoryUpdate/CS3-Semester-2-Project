import mayflower.*;
public class Upgrades extends Actor{
    private int buildings;
    private int production;
    private int cost;
    private int money;
    public Upgrades(){
        buildings = 0;
        production = 0;
        cost = 0;
    }
    public Upgrades(int b, int p, int c){
        buildings = b;
        production = p;
        cost = c;
    }
    public void addBuilding(){
        MyWorld myWorld = (MyWorld)getWorld();
        if(Mayflower.mouseClicked(this) && myWorld.getTotal() > cost)
        {
            myWorld.subtractCost(cost);
            buildings++;
        }
    }
    public int getMoney(){
        return money;
    }
    public void act(){
        MyWorld myWorld = (MyWorld)getWorld();
        addBuilding();
        myWorld.addStuff(buildings*production);
    }
    
    
    
    
}
