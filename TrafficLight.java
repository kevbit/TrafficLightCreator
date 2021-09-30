
/**
 * A Class that can create a basic traffic light at a location.
 *
 * @author Kevin Lo
 * @version 2020-09-09
 */
public class TrafficLight
{
    //declaring constant variables WIDTH, HEIGHT, DIAMETER
    public final int WIDTH = 20;
    public final int HEIGHT = 60;
    public final int DIAMETER = 20;
    // declaring instance variables
    private int xCoordinate;
    private int yCoordinate;

    /**
     * Constructor for objects of class TrafficLight
     * 
     * @param x the x coordinate of the upper-left corner of the traffic light
     * @param y the y coordinate of the upper-left corner of the traffic light
     */
    public TrafficLight(int x, int y)
    {
        // initialise instance variables
        xCoordinate = x;
        yCoordinate = y;
    }

    /**
     * Method that draws a traffic light with lights
     *
     * 
     */
    public void draw()
    {
       Rectangle trafficLightOutLine = new Rectangle(xCoordinate, yCoordinate, WIDTH, HEIGHT);
       //Creating objects for each colored light
       Ellipse redLight = new Ellipse(xCoordinate, yCoordinate, DIAMETER, (HEIGHT/3));
       Ellipse yellowLight = new Ellipse(xCoordinate, yCoordinate + (HEIGHT/3), DIAMETER, (HEIGHT/3));
       Ellipse greenLight = new Ellipse(xCoordinate, yCoordinate + (2*(HEIGHT/3)), DIAMETER, (HEIGHT/3));
       //setting colors for each light
       redLight.setColor(Color.RED);
       yellowLight.setColor(Color.YELLOW);
       greenLight.setColor(Color.GREEN);
       //drawing rectangle and lights
       trafficLightOutLine.draw();
       redLight.fill();
       yellowLight.fill();
       greenLight.fill();
       
        
        
    }
}
