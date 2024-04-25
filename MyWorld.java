import mayflower.*;

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
    public MyWorld()
    {
        Mayflower.showBounds(true);
        rice = new Rice();
        egg = new eggs();
        chive = new chives();
        curry = new curry();
        paneer = new paneer();
        soysauce = new soysauce();
        tofu = new tofu();
        addObject(rice, 400, 400);
        addObject(chive,300,300);
        addObject(egg,300,200);
        addObject(curry,300,100);
        addObject(paneer,100,400);
        addObject(tofu,500,500);
        addObject(soysauce,100,100);
    }
    public void act(){
        showText("" + rice.getRiceCounter(), 100, 100); 
    }
    public void calculate(double multiplier, double active, double upgrades){
        total = (multiplier*active)+upgrades;
    }
    
}
