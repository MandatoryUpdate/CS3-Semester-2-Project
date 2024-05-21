import mayflower.*;
public class JasmineRice extends Upgrades{
    private boolean bought;
    private int cost;
    public JasmineRice(){
        super(0,20,100, 10000, 645, 379);
        MayflowerImage p1 = new MayflowerImage ("img/JasmineRice.png");
        p1.scale(115,115);
        setImage(p1);
    }
    
    
}
