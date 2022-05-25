import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bigshow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bigbox extends Actor
{   
    int deltaX= 5;
    int deltaY= 5;
    
    /**
     * Act - do whatever the bigshow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movment
        setLocation(getX() + deltaX,getY() + deltaY);
        
        //bounces
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
        
         if (isTouching(Bob.class))
        {
            setLocation(400, 300);
            
        }
        turn(35);
         }
    }
