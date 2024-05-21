import mayflower.*;
public class Upgrades extends Actor{
    private int buildings;
    private int production;
    private int cost;
    private int positionX;
    private int position Y;
    private int ActualTimer;
    private int timer;
    public Upgrades(){
        buildings = 0;
        production = 0;
        cost = 0;
        ActualTimer = 0;
    }
    public Upgrades(int b, int p, int c, int t, int x, int y){
        buildings = b;
        production = p;
        cost = c;
        ActualTimer = t;
        timer = ActualTimer;
        positionX = x;
        positionY = y;
    }
    public void act(){
        MyWorld myWorld = (MyWorld)getWorld();
        if(myWorld.getState() < 2 && Mayflower.mouseClicked(this))
        {
            if(myWorld.getTotal() > cost)
            {
                buildings++;
                myWorld.subtractCost(cost);
                System.out.println(buildings);
            }
            
        }
        timer--;
        if(timer <= 0){
            myWorld.addStuff(buildings*production);
            timer = ActualTimer;
        }
        showText(production, positionX, positionY);
    }
}

