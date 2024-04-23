import mayflower.*;

public class MyWorld extends World
{
    private Rice rice;
    public MyWorld()
    {
        Mayflower.showBounds(true);
        setBackground("Curry Pictures/Bluebonnet-8100.jpg");
        rice = new Rice();
        addObject(rice, 400, 100);
    }
    public void act(){
        showText("" + rice.getRiceCounter(), 100, 100);
    }
    
}
