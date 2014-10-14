import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaveTheWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Element extends Actor
{
    public String toString() {
        return getClass().getName() + " " + getX() + " " + getY();
    }
}
        