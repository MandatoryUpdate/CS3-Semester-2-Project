import mayflower.*;

public class MyWorld extends World
{
    private Rice rice;
    private chives chive;
    public MyWorld()
    {
        Mayflower.showBounds(true);
        setBackground("img/Curry.png");
        rice = new Rice();
        chive = new chives();
        addObject(rice, 400, 400);
        addObject(chive,300,300);
    }
    public void act(){
        showText("" + rice.getRiceCounter(), 100, 100);
    }
    
}
