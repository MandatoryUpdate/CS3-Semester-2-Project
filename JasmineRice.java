import mayflower.*;
public class JasmineRice extends Upgrades{
    private boolean bought;
    private int cost;
    public JasmineRice(){
        super(0,20,100);
        MayflowerImage p1 = new MayflowerImage ("img/JasmineRice.png");
        p1.scale(150,150);
        setImage(p1);
    }
    
    public void act(){
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/JasmineRice2.png");
            p2.scale(150,150);
            setImage(p2);
            bought = true;
        }
    }
    
}
