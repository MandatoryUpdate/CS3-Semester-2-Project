import mayflower.*;

public class curry extends oneTimeUpgrade
{
    public curry()
    {
        super(false, 50, 5, "Curry");
        MayflowerImage p = new MayflowerImage ("img/Curry.png");
        p.scale(80,80);
        setImage(p);
    }
}
