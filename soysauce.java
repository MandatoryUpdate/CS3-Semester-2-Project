import mayflower.*;

public class soysauce extends oneTimeUpgrade
{
    public soysauce()
    {
        super(false, 10, 1.5, "SoySauce");
        MayflowerImage p = new MayflowerImage ("img/SoySauce.png");
        p.scale(80,80);
        setImage(p);
    }
}
