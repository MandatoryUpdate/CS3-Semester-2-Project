import mayflower.*;
public class BlackRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BlackRice(){
        super(0,200,1000, 10000);
        MayflowerImage p1 = new MayflowerImage ("img/BlackRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
}
