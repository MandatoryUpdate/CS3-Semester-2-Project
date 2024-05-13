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
    private int buySellState;
    public MyWorld()
    {
        Mayflower.showBounds(false);
        setBackground("img/bg.jfif");
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
        buySellState = 1;
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
        while(total >= 1000000)
        {
            total = total-1000000;
            totalArray.add("1000000");
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
         
        // Reverse the array to 
        // obtain the result 
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
 
    // Function to calculate the total sum 
    public void sumOfLargeNumbers() 
    { 
        // Stores the array of large 
        // numbers in integer format 
        ArrayList<ArrayList<Integer>> x = new ArrayList<>(1000); 
 
        for(int i = 0; i < totalArray.size(); i++)
            x.add(new ArrayList<Integer>());
 
        for(int i = 0; i < totalArray.size(); i++)
        { 
            for(int j = 0; j < 6; j++) 
            { 

                // Convert each element 
                // from character to integer 
                x.get(i).add(totalArray.get(i).charAt(j) - '0'); 
            } 
        } 
     
        // Stores the carry 
        int carry = 0; 
 
        // Stores the result 
        // of summation 
        ArrayList<Integer> result = new ArrayList<>(); 
 
        for(int i = 6 - 1; i >= 0; i--)
        { 
         
            // Initialize the sum 
            int sum = 0; 
 
            for(int j = 0; j < totalArray.size(); j++) 
 
                // Calculate sum 
                sum += x.get(j).get(i); 
 
            // Update the sum by adding 
            // existing carry 
            sum += carry; 
            int temp = sum; 
 
            // Store the number of digits 
            int count = 0; 
            while (temp > 9)
            { 
                temp = temp % 10; 
 
                // Increase count of digits 
                count++; 
            } 
 
            long l = (long)Math.pow(10, count); 
            if (l != 1) 
         
                // If the number exceeds 9, 
                // Store the unit digit in carry 
                carry = (int)(sum / l); 
 
            // Store the rest of the sum 
            sum = sum % 10; 
 
            // Append digit by digit 
            // into result array 
            result.add(sum); 
        } 
        while (carry != 0)
        { 
            int a = carry % 10; 
     
            // Append result until 
            // carry is 0 
            result.add(a); 
            carry = carry / 10; 
        }
 
        // Print the result 
        printResult(result); 
    } 
}
