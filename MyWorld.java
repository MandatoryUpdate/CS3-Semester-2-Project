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
    private LinkedList<oneTimeUpgrade> buyable = new LinkedList<>();
    private ArrayList<String> totalArray = new ArrayList<>();
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
        buildings.add(white);
        buildings.add(jasmine);
        buildings.add(black);
        buildings.add(brown);
        buildings.add(biriyani);
        buildings.add(basmati);
        int count  = 0;
        for(Upgrades a: buildings){
            addObject(a,500,200 + count);
            count+=50;
        }
        addObject(rice, 200, 200);
        all.add(egg);
        all.add(chive);
        all.add(curry);
        all.add(paneer);
        all.add(soysauce);
        all.add(tofu);
    }
    public void act(){
        calculate();
        canBuy();
        showText("" + (int)total, 100, 100);
    }
    public void calculate(){
        total += rice.getRiceCounter() * getMultipliers();
        while(total >= 1000000)
        {
            total = total-1000000;
            totalArray.add("1000000");
        }
        int length = String.valueOf(total).length();
        String s = "";
        for(int i = 0 ; i < length ; i++)
        {
            s = s + "0";
        }
        s = s + total;
        totalArray.add(s);
    }
    public void subtractCost()
    {
        total--;
    }
    public void canBuy()
    {
        if(all.size() < 1){
            
        }
        else if(total > all.peek().getCost())
        {
            oneTimeUpgrade temporary = all.remove();
            buyable.add(temporary);
            addObject(buyable.get(buyable.indexOf(temporary)), 400, 400);
        }
    }
    public int getTotal()
    {
        return (int)total;
    }
    public double getMultipliers()
    {
        double allMult = 1;
        for(oneTimeUpgrade upgrade : buyable)
        {
            if(upgrade.getBought())
            {
                System.out.println(upgrade.getBought());
                allMult+=upgrade.getMultiplier();
            }
        }
        return allMult;
    }
}
