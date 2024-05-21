import mayflower.*;
public class BiriyaniRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BiriyaniRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,50,5000, 10000, 5000, 460);
        MayflowerImage p1 = new MayflowerImage ("img/BiriyaniRice.png");
        p1.scale(115,115);
        setImage(p1);
    }
    
}
