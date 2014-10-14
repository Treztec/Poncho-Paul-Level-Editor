import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1, false);
    }

    public void save() {
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            saveFile(chooser.getSelectedFile().getAbsolutePath());
        }
    }

    private void saveFile(String fname) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fname);
            for(Element e : (List<Element>)getObjects(Element.class)) {
                pw.println(e);
            }
            pw.flush();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Save failed: IOException", 
                "Save failed", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            pw.close();
        }
    }

}
