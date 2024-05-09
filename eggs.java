import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    private boolean bought;
    private int cost;
    private double multiplier;
    public eggs()
    {
        super(false, 10, 1.5);
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(50,50);
        setImage(p);
    }
}
