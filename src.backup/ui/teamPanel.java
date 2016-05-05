package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class teamPanel extends JPanel{
	 public static final Image TEAM=new ImageIcon("Graphics/制作团队.png").getImage();
     @Override
     public void paintComponent(Graphics g){
        g.drawImage(TEAM, 0, 0,1200,700,null);
   }
}
