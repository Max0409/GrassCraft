package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/*
 * load in feifei's mapPanel
 */
public class startPanel extends JPanel{
	 public static final Image START=new ImageIcon("Graphics/����.jpg").getImage();
     @Override
     public void paintComponent(Graphics g){
        g.drawImage(START, 0, 0,1200,700,null);
   }
}
