import mayflower.*;

public class tofu extends oneTimeUpgrade
{
    public tofu()
    {
        super(false, 10, 1.5, "tofu");
        MayflowerImage p = new MayflowerImage ("img/tofu.png");
        p.scale(80,80);
        setImage(p);
    }
}
