/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square floor;
    private Person human;
    private Person human1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-200);
        sun.moveVertical(-150);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-150);
        moon.moveVertical(200);
        moon.changeSize(35);
        moon.makeVisible();
        
        floor = new Square();
        floor.changeColor("green");
        floor.moveHorizontal(-1000000);
        floor.moveVertical(130);
        floor.changeSize(1000000000);
        floor.makeVisible();

        sun.slowMoveVertical(375);
        
        moon.slowMoveVertical(-200);
        
        human = new Person();
        human.moveHorizontal(-300);
        human.moveVertical(40);
        human.makeVisible();
        
        human1 = new Person();
        human1.moveHorizontal(300);
        human1.moveVertical(40);
        human1.makeVisible();
    }
    
    public void amanecer(){
        moon.makeInvisible();
        sun.slowMoveVertical(-200);
        human.slowMoveHorizontal(300);
        human1.slowMoveHorizontal(-280);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
