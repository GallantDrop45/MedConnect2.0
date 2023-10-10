package Modelos;

import javax.swing.*;
import java.awt.*;

public class Btransparente
{  
  public static void main(String[] args) 
  {
    //create a frame
    JFrame frame = new JFrame("JButton Example");
    //create button
    JButton btn = new JButton("Click here");
    //set button position
    btn.setBounds(70,80,100,30);
  
    //make the button transparent
    btn.setOpaque(false);
    //remove content area
    btn.setContentAreaFilled(false);
    //remove the border
    btn.setBorderPainted(false);
  
    frame.add(btn);
    frame.setSize(250,250);
    frame.setLayout(null);
    frame.setVisible(true);  
    
    
  }
}