import mayflower.*;
import java.util.*;
public class MyWorld extends World
{
    private double total;
    private Rice rice;
    private chives chive;
    private eggs egg;
    private curry curry;
    private paneer paneer;
    private soysauce soysauce;
    private tofu tofu;
    private BlackRice black;
    private BasmatiRice basmati;
    private BrownRice brown;
    private JasmineRice jasmine;
    private WhiteRice white;
    private BiriyaniRice biriyani;
    private Queue<oneTimeUpgrade> all = new LinkedList<>();
    private ArrayList<Upgrades> buildings = new ArrayList<Upgrades>();
    public MyWorld()
    {
        Mayflower.showBounds(false);
        rice = new Rice();
        egg = new eggs();
        chive = new chives();
        curry = new curry();
        paneer = new paneer();
        soysauce = new soysauce();
        tofu = new tofu();
        black = new BlackRice();
        basmati = new BasmatiRice();
        brown = new BrownRice();
        jasmine = new JasmineRice();
        white = new WhiteRice();
        biriyani = new BiriyaniRice();
        addObject(rice, 200, 200);
        all.add(egg);
        all.add(chive);
        all.add(curry);
        all.add(paneer);
        all.add(soysauce);
        all.add(tofu);
    }
    public void act(){
        showText("" + (int)total, 100, 100);
        calculate();
        canBuy();
    }
    public void calculate(){
        total += rice.getRiceCounter();
    }
    public void canBuy()
    {
        if(all.size() < 1){
            
        }
        else if(total > all.peek().getCost())
        {
            addObject(all.remove(), 400, 400);
        }
    }
    
}
