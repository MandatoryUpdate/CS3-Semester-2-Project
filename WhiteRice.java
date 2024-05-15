import mayflower.*;
public class WhiteRice extends Upgrades{
    private boolean bought;
    private int cost;
    public WhiteRice(){
        super(0,5,20,10);
        MayflowerImage p1 = new MayflowerImage ("img/WhiteRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
