import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class smallboi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smallline extends Actor
{   
    int deltaX= -5;
    int deltaY= -5;
    /**
     * Act - do whatever the smallboi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(90);
        setLocation(getX() + deltaX,getY() + deltaY);
        if(getX()<60)
        {
            deltaX=+3;
        }
        
        if(getX()>530)
        {
            deltaX=-3;
        }
        
        if(getY()<70)
        {
            deltaY=+3;
        }
        
        if(getY()>320)
        {
            deltaY = -3;
        }
        //slow rotation of object
        turn(1);
        
        if (isTouching(Bob.class))
        {
            setLocation(200, 300);
            
        }

    }
}
