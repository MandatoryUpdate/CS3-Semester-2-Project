import mayflower.*;

public class eggs extends oneTimeUpgrade
{
    private boolean bought;
    public eggs()
    {
        MayflowerImage p = new MayflowerImage ("img/Egg.png");
        p.scale(200,200);
        setImage(p);
    }
    public void act()
    {
        if(Mayflower.mouseClicked(this)){
            MayflowerImage p2 = new MayflowerImage ("img/Egg2.png");
            p2.scale(200,200);
            setImage(p2);
            super.addMultiplier(2);
        }
    }
}