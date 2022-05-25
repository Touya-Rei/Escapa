import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (edp 445) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject (new Bob(), 300, 200 );
        addObject (new Bigbox(), 400, 300 );
        addObject (new Longline(), 400, 100);
        addObject (new Smallline(), 200, 300 );
        addObject (new Smallbox(), 200, 100 );
    }
}
