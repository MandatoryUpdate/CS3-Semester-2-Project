import mayflower.*;

public class chives extends oneTimeUpgrade
{
    public chives()
    {
        MayflowerImage p = new MayflowerImage ("img/Chives.png");
        p.scale(200,200);
        setImage(p);
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Chives2.png");
            p2.scale(200,200);
            setImage(p2);
        }
    }
}
