import mayflower.*;

public class paneer extends oneTimeUpgrade
{
    private boolean bought;
    public paneer()
    {
        MayflowerImage p = new MayflowerImage ("img/Paneer.png");
        p.scale(200,200);
        setImage(p);
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Paneer2.png");
            p2.scale(200,200);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}