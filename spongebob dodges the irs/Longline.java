import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lankyboi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Longline extends Actor
{   
    int deltaX= -5;
    int deltaY= 5;
    /**
     * Act - do whatever the lankyboi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        //movement
        setLocation(getX() + deltaX,getY() + deltaY);
        
        //bounces
        if(getX()<80)
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
        turn(1);
        
        if (isTouching(Bob.class))
        {
            setLocation(400, 300);
            
        }
    }
}
