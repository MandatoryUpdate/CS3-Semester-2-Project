import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    public eggs()
    {
        super(false, 10, 1.5, "Egg");
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(50,50);
        setImage(p);
    }
}
