import mayflower.*;

public class paneer extends oneTimeUpgrade
{
    public paneer()
    {
        super(false, 500, 50, "Paneer");
        MayflowerImage p = new MayflowerImage ("img/Paneer.png");
        p.scale(80,80);
        setImage(p);
    }
}
