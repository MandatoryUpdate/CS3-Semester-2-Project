import mayflower.*;
public class Cookie extends Actor
{
    private String unhighlighted;
    private String highlighted;
    
    public Cookie(String u, String h)
    {
        unhighlighted = u;
        highlighted = h;
        setImage(unhighlighted);
    }
    public void act(){
        if (Mayflower.mouseMoved(this) && Mayflower.mouseClicked(this))
            setImage(unhighlighted);
    }
}