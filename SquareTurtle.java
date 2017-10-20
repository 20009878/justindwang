import edu.fcps.Turtle;
/**
 * Creates different types of SquareTurtles
 * 
 * @author Helen Sohn
 * @author Justin Wang
 * @period 2
 * @teacher Mr. Coglianese
 * @version 10-19-17
 */
public class SquareTurtle extends Turtle
{
    private double mySize;

    //*************************constructors*************************
    /**
     * Creates a SquareTurtle with default starting coordinates,
     * tilting degree, and size of the box
     */
    public SquareTurtle()
    {
        super();
        mySize = 50.0;
    }

    /**
     * Creates a SquareTurtle with default starting coordinates,
     * tilting degree, custom size of the box
     * 
     * @param n     size of the drawn box
     */
    public SquareTurtle(double n)
    {
        super();
        mySize = n;
    }

    
    /**
     * Creates a SquareTurtle with custom starting coordinates,
     * custom tilting degree, default size of the box
     * 
     * @param h     size of the drawn box
     * @param x     x-coordinate of starting position
     * @param y     y-coordinate of starting position
     */
    public SquareTurtle(double x, double y, double h)
    {
        super(x, y, h);
        mySize = 50.0;
    }

    /**
     * Creates a SquareTurtle with custom starting coordinates,
     * custom tilting degree, custom size of the box
     * 
     * @param x     x-coordinate of starting position
     * @param y     y-coordinate of starting position
     * @param h     tilting degree of turtle
     * @param n     size of the drawn box
     */
    public SquareTurtle(double x, double y, double h, double n)
    {
        super(x, y, h);
        mySize = n;
    }

    //************************methods*****************************
    /**
     * Sets the input size to mySize variable
     * 
     * @param n     size of drawn box
     */
    public void setSize(double n)
    {
        mySize = n;
    }

    /**
     * makes the SquareTurtle draw the square
     */
    public void drawShape()
    {
        for(int x=0; x<=3; x++) {
            forward(mySize);
            turnLeft(90);
        }
    }
    
    /**
     * makes the SquareTurtle draw a polygon of given
     * number of sides
     * 
     * @param s    custom number of sides
     */
    public void drawShape(int s)
    {
        setSize(s);
        for(int x=0; x<s; x++) {
            forward(mySize);
            turnLeft(360/s);
        }
    }
    
    
}