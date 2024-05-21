import mayflower.*;

public class tofu extends oneTimeUpgrade
{
    public tofu()
    {
        super(false, 100, 10, "tofu");
        MayflowerImage p = new MayflowerImage ("img/tofu.png");
        p.scale(80,80);
        setImage(p);
    }
}
