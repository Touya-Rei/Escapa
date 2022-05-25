import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends Actor
{   //timer in constructor to run once
        SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bob ()
    //relaxing music
    {
        GreenfootSound music = new GreenfootSound("calmmusic.wav");
     //to loop the song when it stops
    if(!music.isPlaying())
    {
    music.play();
    }
        Greenfoot.playSound("calmmusic.wav");
        timer.mark();
    }
    
    public void act()
    //to start the timer
    {   
        int time= timer.millisElapsed()/1000;
      if (Greenfoot.isKeyDown("w"))
        
        setLocation(getX(), getY() - 10);
      if (Greenfoot.isKeyDown("s"))
        
        setLocation(getX(), getY() + 10);
        
      if (Greenfoot.isKeyDown("a"))
        
        setLocation(getX() -10, getY());
      if (Greenfoot.isKeyDown("d"))
        
        setLocation(getX() +10, getY());
        
        
        
        //game over cons borders
      if(getX()<50)
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
            Greenfoot.stop();
        }
        
      if(getX()>545)
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");

        }
        
      if(getY()<60)
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
        
      if(getY()>340)
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
        
        //gameover cons for  objects
      if (isTouching(Bigbox.class))
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
      
      if (isTouching(Smallbox.class))
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
      
      if (isTouching(Smallline.class))
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
      
      if (isTouching(Longline.class))
        {
            Greenfoot.stop();
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText(""+time, 300, 50);
            timer.mark();
            Greenfoot.playSound("shesh.wav");
        }
      
      }
      
        }
        

