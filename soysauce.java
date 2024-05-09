import mayflower.*;

public class soysauce extends oneTimeUpgrade
{
    public soysauce()
    {
        super(false, 10, 1.5);
        MayflowerImage p = new MayflowerImage ("img/SoySauce.png");
        p.scale(80,90);
        setImage(p);
    }
}
