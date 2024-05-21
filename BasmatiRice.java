import mayflower.*;
public class BasmatiRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BasmatiRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,5000,50000, 10000, 5000, 547);
        MayflowerImage p1 = new MayflowerImage ("img/BasmatiRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
