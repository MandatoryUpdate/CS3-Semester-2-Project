import mayflower.*;
public class BasmatiRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BasmatiRice(){
        super(0,5000,50000, 10000);
        MayflowerImage p1 = new MayflowerImage ("img/BasmatiRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
