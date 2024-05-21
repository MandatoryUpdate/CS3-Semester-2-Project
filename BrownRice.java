import mayflower.*;
public class BrownRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BrownRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,75,500, 10000, 642, 305);
        MayflowerImage p1 = new MayflowerImage ("img/BrownRice.png");
        p1.scale(135,90);
        setImage(p1);
    }
    
    
}
