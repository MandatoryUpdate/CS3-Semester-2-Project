import mayflower.*;
public class BiriyaniRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BiriyaniRice(){
        super(0,600,5000, 10000);
        MayflowerImage p1 = new MayflowerImage ("img/BiriyaniRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
