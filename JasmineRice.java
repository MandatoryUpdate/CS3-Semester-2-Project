import mayflower.*;
public class JasmineRice extends Upgrades{
    private boolean bought;
    private int cost;
    public JasmineRice(){
        //The order is as follows, buildings (amount of buildings), production (how much they make), cost, timer (how long it takes to gen), positionX, positionY
        super(0,2,100, 10000, 645, 379);
        MayflowerImage p1 = new MayflowerImage ("img/JasmineRice.png");
        p1.scale(115,115);
        setImage(p1);
    }
    
    
}
