import mayflower.*;
public class Rice extends Actor
{
    private String unhighlighted;
    private String highlighted;
    
    public Rice(String u, String h)
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
