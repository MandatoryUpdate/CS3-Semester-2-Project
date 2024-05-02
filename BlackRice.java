import mayflower.*;
public class BlackRice extends Upgrades{
    private boolean bought;
    private int cost;
    public BlackRice(){
        super(0,200,1000);
        MayflowerImage p1 = new MayflowerImage ("img/BlackRice.png");
        p1.scale(100,100);
        setImage(p1);
    }
    
    public void act(){
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/BlackRice2.png");
            p2.scale(100,100);
            setImage(p2);
            bought = true;
        }
    }
    
}
