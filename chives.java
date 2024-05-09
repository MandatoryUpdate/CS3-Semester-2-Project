import mayflower.*;

public class chives extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public chives()
    {
        super(false, 10, 1.5);
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(80,80);
        setImage(p);
    }
}
