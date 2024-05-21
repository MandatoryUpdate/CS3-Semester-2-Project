import mayflower.*;
public class BlackRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BlackRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,200,1000, 10000, 645, 188);
        MayflowerImage p1 = new MayflowerImage ("img/BlackRice.png");
        p1.scale(115,115);
        setImage(p1);
    }
    
}
