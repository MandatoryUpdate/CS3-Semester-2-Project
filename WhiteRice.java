import mayflower.*;
public class WhiteRice extends Upgrades{
    private boolean bought;
    private int cost;
    public WhiteRice(){
        super(0,5,20, 10000);
        MayflowerImage p1 = new MayflowerImage ("img/WhiteRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
    public void act(){
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/WhiteRice2.png");
            p2.scale(100,100);
            setImage(p2);
            bought = true;
        }
    }
    
}
