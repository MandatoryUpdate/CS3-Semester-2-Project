import mayflower.*;
public class BrownRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BrownRice(){
        super(0,75,500, 10000);
        MayflowerImage p1 = new MayflowerImage ("img/BrownRice.png");
        p1.scale(150,100);
        setImage(p1);
    }
    
    
}
