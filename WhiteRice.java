import mayflower.*;
public class WhiteRice extends Upgrades{
    private boolean bought;
    private int cost;
    public WhiteRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,1,20,10, 5000, 90);
        MayflowerImage p1 = new MayflowerImage ("img/WhiteRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
