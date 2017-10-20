//Name______________________________ Date_____________
import edu.fcps.Turtle;
/**
 * Creates different types of PolygonTurtles
 * 
 * @author Helen Sohn
 * @author Justin Wang
 * @period 2
 * @teacher Mr. Coglianese
 * @version 10-19-17
 */
public class PolygonTurtle extends Turtle
{
    private double mySize;
    private int mySides;
    /**
     * Creates a 6 sided PolygonTurtle with default starting coordinates,
     * tilting degree, and side length
     */
    public PolygonTurtle()
    {
        super();
        mySize = 50.0;
        mySides = 6;
    }

    /**
     * Creates a PolygonTurtle with default starting coordinates,
     * tilting degree, custom number of sides and side length
     * 
     * @param n     size of the drawn box
     */
    public PolygonTurtle(double n, int s)
    {
        mySize = n;
        mySides = s;
    }

    
    /**
     * Creates a PolygonTurtle with custom starting coordinates,
     * tilting degree, number of sides, and side length
     * 
     * @param h    size of the drawn box
     * @param x    x-coordinate of starting position
     * @param y    y-coordinate of starting position
     * @param n    side length
     * @param s    number of sides
     */
    public PolygonTurtle(double x, double y, double h, double n, int s)
    {
        super(x, y, h);
        mySize = n;
        mySides = s;
    }

    /**
     * Sets the input size to mySize variable
     * 
     * @param n    side length
     */
    public void setSize(double n)
    {
        mySize = n;
    }

    /**
     * Sets the input size to mySides variable
     * 
     * @param n    number of sides
     */
    public void setSides(int s)
    {
        mySides = s;
    }

     /**
     * makes the PolygonTurtle draw a polygon 
     */
    public void drawShape()
    {
        for(int x=0; x<mySides; x++) {
            forward(mySize);
            turnLeft(360/mySides);
        }
    } 

}
