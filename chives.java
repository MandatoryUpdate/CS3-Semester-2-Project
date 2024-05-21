import mayflower.*;

public class chives extends oneTimeUpgrade
{
    public chives()
    {
        super(false, 20, 2, "Chives");
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(80,80);
        setImage(p);
    }
}
