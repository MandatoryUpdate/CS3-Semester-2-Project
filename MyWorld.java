import mayflower.*;
import java.util.*;
import java.lang.*;
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
    private buyButton Buying;
    private sellButton Selling;
    private int buySellState;
    public MyWorld()
    {
        Mayflower.showBounds(false);
        setBackground("img/bg.jfif");
        rice = new Rice();
        egg = new eggs();
        chive = new chives();
        curry = new curry();
        Buying = new buyButton();
        Selling = new sellButton();
        paneer = new paneer();
        soysauce = new soysauce();
        tofu = new tofu();
        black = new BlackRice();
        basmati = new BasmatiRice();
        brown = new BrownRice();
        jasmine = new JasmineRice();
        white = new WhiteRice();
        biriyani = new BiriyaniRice();
        buySellState = 1;
        addEverything();
    }
    public void subtractCost(int amount)
    {
        total = total-amount;
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
    public void act(){
        canBuy();
        calculate();
        if(total == 0){
            showText("" + (int)total, 100, 100);
        }
        else{
            sumOfLargeNumbers();
            totalArray = new ArrayList<>();
        }
    }
    public void calculate(){
        total += rice.getRiceCounter() * getMultipliers();
        while(total >= 1000000000)
        {
            total = total-1000000000;
            totalArray.add("1000000000");
        }
        int length = Integer.toString((int)total).length();
        String s = "";
        for(int i = 0 ; i < 6 - length; i++)
        {
            s = s + "0";
        }
        s = s + total;
        totalArray.add(s);
    }
    public double getMultipliers()
    {
        double allMult = 1;
        for(oneTimeUpgrade upgrade : buyable)
        {
            if(upgrade.getBought())
            {
                allMult+=upgrade.getMultiplier();
            }
        }
        return allMult;
    }
    public void printResult(ArrayList<Integer> result) 
    { 
        Collections.reverse(result);
        String total = "";
        boolean value = false;
        for(int i = 0 ; i < result.size() ; i++)
        {
            if(result.get(i) > 0 && !value)
                value = true;
            if(value || result.get(i) > 0){
                total = total + result.get(i);
            }
        }
        showText("" + total, 100, 100);
    }
    public void addStuff(int amount)
    {
        total+=amount;
    }
    public int getState()
    {
        return buySellState;
    }
    public void setState(int val)
    {
        buySellState = val;
    }
 
    public void sumOfLargeNumbers() 
    { 
        ArrayList<ArrayList<Integer>> x = new ArrayList<>(1000); 
        for(int i = 0; i < totalArray.size(); i++)
            x.add(new ArrayList<Integer>());
        for(int i = 0; i < totalArray.size(); i++)
        { 
            for(int j = 0; j < 6; j++) 
            {  
                x.get(i).add(totalArray.get(i).charAt(j) - '0'); 
            } 
        } 
        int carry = 0; 
        ArrayList<Integer> result = new ArrayList<>(); 
        for(int i = 6 - 1; i >= 0; i--)
        { 
            int sum = 0;
            for(int j = 0; j < totalArray.size(); j++) 
                sum += x.get(j).get(i); 
            sum += carry; 
            int temp = sum; 
            int count = 0; 
            while (temp > 9)
            { 
                temp = temp % 10; 
                count++; 
            } 
            long l = (long)Math.pow(10, count); 
            if (l != 1) 
                carry = (int)(sum / l);
            sum = sum % 10; 
            result.add(sum); 
        } 
        while (carry != 0)
        { 
            int a = carry % 10; 
            result.add(a); 
            carry = carry / 10; 
        }
        printResult(result); 
    } 
    public void addEverything()
    {
        //Because Jesus there's a lot of things.
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
}
