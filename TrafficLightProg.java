/**
 * A Java class to test class TrafficLight.
 *
 * @author  Kevin Lo
 * @version 2020-09-09
 */
public class TrafficLightProg
{
    public static void main(String[] args)
    {
        TrafficLight lightOne = new TrafficLight(50, 20);
        lightOne.draw();

        TrafficLight lightTwo = new TrafficLight(100, 20);
        lightTwo.draw();

        TrafficLight lightThree = new TrafficLight(100, 100);
        lightThree.draw();

        TrafficLight lightFour = new TrafficLight(-10, -20);
        lightFour.draw();
    }
}